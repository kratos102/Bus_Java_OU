package com.ptk.dao;

import java.util.List;

import com.ptk.pojo.User;

public interface UserDao {
    public User getUserById(int id);

    public User getUserByUsername(String username);

    public void addUser(User user);

    public void updateUser(User user);

    public void deleteUser(User user);

    public List<User> getAllUsers();
}
