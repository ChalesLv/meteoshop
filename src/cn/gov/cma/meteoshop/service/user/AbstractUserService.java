package cn.gov.cma.meteoshop.service.user;

import cn.gov.cma.meteoshop.model.user.UserInfo;

/**
 * Created by lvchao on 2017/3/27.
 */
public abstract class AbstractUserService {

    private AdminImplService adminImplService;
    private GuestImplservice guestImplService;

    public AdminImplService getAdminImplService() {
        return adminImplService;
    }
    public void setAdminImplService(AdminImplService adminImplService) {
        this.adminImplService = adminImplService;
    }

    public GuestImplservice getGuestImplService(){return guestImplService;}
    public void setGuestImplService(GuestImplservice guestImplService){this.guestImplService = guestImplService;}

    public abstract UserInfo getUserInfo(String id);
}
