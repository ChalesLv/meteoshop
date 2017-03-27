package cn.gov.cma.meteoshop.service.user;

import cn.gov.cma.meteoshop.model.user.UserInfo;

/**
 * Created by lvchao on 2017/3/27.
 */
public abstract class AbstractUserService {
    public abstract UserInfo getUserInfo(String id);
}
