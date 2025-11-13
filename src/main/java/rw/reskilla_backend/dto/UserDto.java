package rw.reskilla_backend.dto;

import java.util.UUID;
import rw.reskilla_backend.model.Role;

public class UserDto {
    private UUID userId;
    private String fullName;
    private String email;
    private Role role;
    private boolean active;
    private String profilePicture;
    private String currentOccupation;
    private String careerGoal;
}