package za.co.kaili.springbootjwtauthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.kaili.springbootjwtauthentication.models.ERole;
import za.co.kaili.springbootjwtauthentication.models.Role;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
