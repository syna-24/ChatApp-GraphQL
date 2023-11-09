package id.longquoc.messenger.service.impl;

import id.longquoc.messenger.model.User;
import id.longquoc.messenger.repository.UserRepository;
import id.longquoc.messenger.service.IUserService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService implements IUserService {

    private final UserRepository userRepository;


    @SneakyThrows
    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
