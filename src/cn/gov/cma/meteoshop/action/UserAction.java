package cn.gov.cma.meteoshop.action;

import cn.gov.cma.meteoshop.model.user.UserInfo;
import cn.gov.cma.meteoshop.service.user.UserContractManage;

import javax.swing.*;

/**
 * Created by lvchao on 2017/3/27.
 */
public class UserAction {
    public UserAction(){
        UserInfo userInfo = UserContractManage.getUserInfo("guestImplService","guest");
        JOptionPane.showConfirmDialog(null,userInfo.getUsername()+"\t"+userInfo.getPassword());
    }
}
