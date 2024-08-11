package Sringboot_MethodArguementNotValidException.Repository;

import Sringboot_MethodArguementNotValidException.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{
}
