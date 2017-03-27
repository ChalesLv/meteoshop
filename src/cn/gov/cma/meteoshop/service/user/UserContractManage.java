package cn.gov.cma.meteoshop.service.user;

import cn.gov.cma.meteoshop.model.user.UserInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by lvchao on 2017/3/27.
 */
public class UserContractManage {
        private static ApplicationContext applicationContext = new FileSystemXmlApplicationContext("/config/meteoshopServiceContext.xml");
        public UserContractManage(){
        }

        public static UserInfo getUserInfo(String serviceId, String id){
            AbstractUserService abstractUserService= (AbstractUserService) applicationContext.getBean(serviceId);
            return abstractUserService.getUserInfo(id);
        }
}
