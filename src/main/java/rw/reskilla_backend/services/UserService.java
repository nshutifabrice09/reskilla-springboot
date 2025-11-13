package rw.reskilla_backend.services;

import rw.reskilla_backend.dto.UserDto;
import rw.reskilla_backend.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    User save(User userDto);
    List<User> getAllUsers();
    User getUser(UUID id);
    User updateUser(UUID id, User user);
    void removeUser(UUID id);
}
