package rw.reskilla_backend.dto;

import rw.reskilla_backend.model.Role;

public class UserCreateDto {
    private String fullName;
    private String email;
    private String password;
    private Role role;
    private String profilePicture;
    private String currentOccupation;
    private String careerGoal;
}
