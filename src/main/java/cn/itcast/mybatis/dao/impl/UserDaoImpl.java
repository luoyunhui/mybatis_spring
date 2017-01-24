package cn.itcast.mybatis.dao.impl;

import java.util.List;

import cn.itcast.mybatis.dao.IUserDao;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.itcast.mybatis.domain.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements IUserDao {

    public User findUserById(String id) {
        return (User) this.getSqlSession().selectOne("cn.itcast.mybatis.domain.User.selectUserById", id);
    }

    public int deleteUserById(String id) {
        int i = this.getSqlSession().delete("cn.itcast.mybatis.domain.User.deleteUserById", id);
        return i;
    }

    public List<User> findAllUser() {
        return this.getSqlSession().selectList("cn.itcast.mybatis.domain.User.selectAllUsers");
    }

    public List<User> findUserByCondition(User u) {
        return this.getSqlSession().selectList("cn.itcast.mybatis.domain.User.selectUserByCondition", u);
    }

    public int saveUser(User u) {
        int i = this.getSqlSession().insert("cn.itcast.mybatis.domain.User.insertUser", u);
        return i;
    }

    public int updateUserById(User u) {
        int i = this.getSqlSession().update("cn.itcast.mybatis.domain.User.updateUserById", u);
        return i;
    }

    public int updateUser(User u) {
        int i = this.getSqlSession().update("cn.itcast.mybatis.domain.User.updateUserByCondition", u);
        return i;
    }

}
