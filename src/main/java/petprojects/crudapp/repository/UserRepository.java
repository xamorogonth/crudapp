package petprojects.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import petprojects.crudapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
