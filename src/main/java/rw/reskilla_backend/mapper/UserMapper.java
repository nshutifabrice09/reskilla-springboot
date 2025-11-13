//package rw.reskilla_backend.mapper;
//
//import rw.reskilla_backend.dto.UserDto;
//import rw.reskilla_backend.model.User;
//
//public class UserMapper {
//
//    public static UserDto toDto(User user) {
//        if (user == null) {
//            return null;
//        }
//
//        UserDto dto = new UserDto();
//        dto.setUserId(user.getUserId());
//        dto.setFullName(user.getFullName());
//        dto.setEmail(user.getEmail());
//        dto.setPassword(user.getPassword());
//        dto.setRole(user.getRole());
//        dto.setActive(user.isActive());
//        dto.setProfilePicture(user.getProfilePicture());
//        dto.setCurrentOccupation(user.getCurrentOccupation());
//        dto.setCareerGoal(user.getCareerGoal());
//        return dto;
//    }
//
//    public static User toEntity(UserDto dto) {
//        if (dto == null) {
//            return null;
//        }
//
//        User user = new User();
//        user.setUserId(dto.getUserId());
//        user.setFullName(dto.getFullName());
//        user.setEmail(dto.getEmail());
//        user.setPassword(dto.getPassword());
//        user.setRole(dto.getRole());
//        user.setActive(dto.isActive());
//        user.setProfilePicture(dto.getProfilePicture());
//        user.setCurrentOccupation(dto.getCurrentOccupation());
//        user.setCareerGoal(dto.getCareerGoal());
//        return user;
//    }
//}
//
