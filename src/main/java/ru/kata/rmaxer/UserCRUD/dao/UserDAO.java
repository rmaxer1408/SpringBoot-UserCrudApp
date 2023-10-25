package ru.kata.rmaxer.UserCRUD.dao;

import ru.kata.rmaxer.UserCRUD.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();

    User getUserById(int id);

    void createUser(User user);

    void updateUser(User user);

    void removeUser(int id);

}
