package com.project.security.carcenterresourceserver.repositories;

import com.project.security.carcenterresourceserver.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
