package com.example.RegisterLoginService.Repo;


import com.example.RegisterLoginService.Entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@EnableJpaRepositories
@Repository
public interface AppUserRepo extends JpaRepository<AppUser, Integer> {

    Optional<AppUser> findOneByEmailAndPassword(String email, String password);

    AppUser findByEmail(String email);
}
