package cn.itcast.mybatis.service.impl;

import cn.itcast.mybatis.dao.IUserDao;
import cn.itcast.mybatis.domain.User;
import cn.itcast.mybatis.service.IUserService;

import java.util.List;

public class UserServiceImpl implements IUserService {

    private IUserDao userDao;
    public int deleteUserById(String id) {
        int i = userDao.deleteUserById(id);
//        int c = 1 / 0;
        return i;
    }

    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    public List<User> findUserByCondition(User u) {
        return userDao.findUserByCondition(u);
    }

    public User findUserById(String id) {
        return userDao.findUserById(id);
    }

    public int saveUser(User u) {
        return userDao.saveUser(u);
    }

    public int updateUser(User u) {
        return userDao.updateUser(u);
    }

    public int updateUserById(User u) {
        return userDao.updateUserById(u);
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

}
