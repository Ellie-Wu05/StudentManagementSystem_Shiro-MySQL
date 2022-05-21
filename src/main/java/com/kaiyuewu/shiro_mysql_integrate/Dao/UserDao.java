package com.kaiyuewu.shiro_mysql_integrate.Dao;

import com.kaiyuewu.shiro_mysql_integrate.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Long> {

    public User findUserByUsername(String username);
}
