package com.project.security.carcenterresourceserver.database.car;

import com.project.security.carcenterresourceserver.database.repositories.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/car")
public class CarResource {

    @Autowired
    CarsRepository carsRepository;

    @PostMapping(value = "/addCar")
    public String add(@RequestBody final Car car) {
        carsRepository.save(car);
        return "added";
    }

    @GetMapping(path = "/getCars")
    public List<Car> get() {
        return carsRepository.findAll();
    }

}
