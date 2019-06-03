package com.project.security.carcenterresourceserver.resources;

import com.project.security.carcenterresourceserver.models.User;
import com.project.security.carcenterresourceserver.models.UserOperationStatusModel;
import com.project.security.carcenterresourceserver.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

@RestController
@RequestMapping(value = "/rest/user")
public class UserResource {

    @Autowired
    UserRepository userRepository;

    @PostMapping(value = "/addUser")
    public String add(@RequestBody final User user) {
        try {
            userRepository.save(user);
        } catch (Exception e) {
            return "username or email duplicated";
        }
        return "added";
    }

    @DeleteMapping(path = "/{id}")
    public String delete(@PathVariable Integer id) {
        try {
            if (userRepository.findById(id) != null) {
                userRepository.deleteById(id);
            }
            UserOperationStatusModel value = new UserOperationStatusModel();
            value.setOperationName(UserRequestOperationName.DELETE.name());
            value.setOperationResult(UserRequestOperationStatus.SUCCESS.name());
        } catch (Exception e) {
            return "cannot delete user";
        }
        return "deleted";
    }
}
