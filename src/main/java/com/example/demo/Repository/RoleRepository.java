
package com.example.Merchant_management.Repository;
import java.util.Optional;


import com.example.Merchant_management.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

    Optional<Role> findByAuthority(String authority);

}
