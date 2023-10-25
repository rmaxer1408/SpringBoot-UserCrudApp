package ru.kata.rmaxer.UserCRUD.service;

import ru.kata.rmaxer.UserCRUD.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    User getUserById(int id);

    void createUser(User user);

    void updateUser(User user);

    void removeUser(int id);
}
