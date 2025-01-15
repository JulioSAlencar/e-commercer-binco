package E_commerce_Binco.Binco.repositories;

import E_commerce_Binco.Binco.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoty extends JpaRepository<User, Long> {
}
