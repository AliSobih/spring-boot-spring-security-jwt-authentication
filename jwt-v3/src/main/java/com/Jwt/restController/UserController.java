package com.Jwt.restController;

import com.Jwt.entity.User;
import com.Jwt.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserRepo userRepo;

    @PatchMapping("/active/{id}")
    public boolean changeActivity(@PathVariable Long id) {
        User user = userRepo.findById(id).orElse(null);
        if (user == null) {
            return false;
        }
        user.setActive(!user.isActive());
        userRepo.save(user);
        return true;
    }
}
