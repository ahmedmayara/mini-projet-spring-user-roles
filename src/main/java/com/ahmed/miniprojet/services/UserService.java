package com.ahmed.miniprojet.services;

import com.ahmed.miniprojet.dto.RegistrationDto;
import com.ahmed.miniprojet.entities.User;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);
    User findUserByUsername(String username);
}
