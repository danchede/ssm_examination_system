package com.ifox.entity;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in20:07 2018/5/8
 * @Modified By:
 */
public class UserloginCustom  extends Userlogin{
    private Role role_ob;

    public void setRole(Role role) {
        this.role_ob = role_ob;
    }

    public Role getRole_ob() {
        return role_ob;
    }
}
