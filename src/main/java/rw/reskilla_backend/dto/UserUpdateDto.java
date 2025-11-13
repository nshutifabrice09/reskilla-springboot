package rw.reskilla_backend.dto;

import rw.reskilla_backend.model.Role;

public class UserUpdateDto {
    private String fullName;
    private String password;
    private Role role;
    private boolean active;
    private String profilePicture;
    private String currentOccupation;
    private String careerGoal;
}
