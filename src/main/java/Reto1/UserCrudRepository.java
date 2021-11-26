package Reto1;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author María José
 */
public interface UserCrudRepository extends CrudRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);
    //Optional<User> findByName(String name);
}
