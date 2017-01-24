package cn.itcast.mybatis.service;

import java.util.List;

import cn.itcast.mybatis.domain.User;

public interface IUserService {

    User findUserById(String id);

    List<User> findAllUser();

    List<User> findUserByCondition(User u);

    int deleteUserById(String id);

    int saveUser(User u);

    int updateUserById(User u);

    int updateUser(User u);

}
