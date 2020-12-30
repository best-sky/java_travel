package cn.itcast.travel.service;

import cn.itcast.travel.domain.User;

public interface UserService {
    /*
     * 注册用户
     * */
    boolean regist(User user);
}
