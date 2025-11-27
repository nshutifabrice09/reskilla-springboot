package rw.reskilla_backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.UUID;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class UserInactiveException extends RuntimeException{

    public UserInactiveException(String message) {
        super(message);
    }

    public UserInactiveException(UUID id){
        super("User is inactive: "+id);
    }
}
