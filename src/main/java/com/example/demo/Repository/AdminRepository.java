
package com.example.Merchant_management.Repository;
import java.util.Optional;

import com.example.Merchant_management.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Optional<Admin> findByUsername(String username);
}
