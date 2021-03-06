package com.hospital.service;

import com.hospital.entity.User;

import java.util.List;

/**
 * Created by Jimmy on 2017/3/11.
 */
public interface UserService {
    Integer saveUser(User user);

    List<User> getAllUser();

    User getUser(String name);

    void deleteUser(Integer id);

    void updateUser(User user);

}
