package testgroup.web.service;

import testgroup.web.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void save(User user);
    void delete(User user);
    User findById(Long id);
    User getUserByEmail (String email);
}
