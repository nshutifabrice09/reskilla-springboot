package rw.reskilla_backend.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rw.reskilla_backend.model.User;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository <User, UUID> {


    @Transactional
    @Modifying

    User findUserById(UUID id);
}
