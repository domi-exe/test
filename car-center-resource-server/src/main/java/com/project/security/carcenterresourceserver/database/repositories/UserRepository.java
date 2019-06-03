package com.project.security.carcenterresourceserver.database.repositories;

import com.project.security.carcenterresourceserver.database.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
