package cn.gov.cma.meteoshop.service.user;

import cn.gov.cma.meteoshop.model.user.UserInfo;
import org.springframework.stereotype.Service;

/**
 * Created by lvchao on 2017/3/27.
 */
@Service
public class GuestImpliservice extends AbstractUserService{
    @Override
    public UserInfo getUserInfo(String id) {
        return new UserInfo(id, "guest", "guest");
    }
}
