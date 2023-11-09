package id.longquoc.messenger.controller;

import id.longquoc.messenger.model.User;
import id.longquoc.messenger.repository.UserRepository;
import id.longquoc.messenger.service.impl.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class UserController {
    private final UserService userService;

    @QueryMapping
    public List<User> findAllUsers() {
        return userService.findAllUsers();
    }


}
