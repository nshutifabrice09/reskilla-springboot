package rw.reskilla_backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rw.reskilla_backend.dto.UserDto;
import rw.reskilla_backend.model.User;
import rw.reskilla_backend.repository.UserRepository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImplementation implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(UUID id) {
        return userRepository.findUserById(id);
    }

    @Override
    public User updateUser(UUID id, User user) {
        User existUser = userRepository.findUserById(id);
        if(existUser != null){
            existUser.setFullName(user.getFullName());
            existUser.setEmail(user.getEmail());
            existUser.setPassword(user.getPassword());
            existUser.setRole(user.getRole());
            existUser.setActive(user.isActive());
            existUser.setProfilePicture(user.getProfilePicture());
            existUser.setCurrentOccupation(user.getCurrentOccupation());
            existUser.setCareerGoal(user.getCareerGoal());
            return userRepository.save(existUser);
        }
        return null;
    }

    @Override
    public void removeUser(UUID id) {
        userRepository.deleteById(id);
    }
}
