package com.project.security.carcenterresourceserver.database.repositories;

import com.project.security.carcenterresourceserver.database.car.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepository extends JpaRepository<Car, Integer> {
}
