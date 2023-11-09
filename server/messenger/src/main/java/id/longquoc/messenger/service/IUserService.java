package id.longquoc.messenger.service;

import id.longquoc.messenger.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAllUsers();
}
