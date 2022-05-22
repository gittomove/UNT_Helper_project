package com.example.snickersdevops.services;

import com.example.snickersdevops.exсeptions.ResourceUnavailableException;
import com.example.snickersdevops.exсeptions.UnauthorizedActionException;
import com.example.snickersdevops.exсeptions.UserAlreadyExistsException;
import com.example.snickersdevops.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User saveUser(User user) throws UserAlreadyExistsException;

    User find(Long id) throws ResourceUnavailableException;;

    User findByEmail(String email) throws ResourceUnavailableException;

    User findByUsername(String username) throws ResourceUnavailableException;

    User updatePassword(User user, String password) throws ResourceUnavailableException;

    void delete(Long user_id) throws UnauthorizedActionException, ResourceUnavailableException;

    User setRegistrationCompleted(User user) throws ResourceUnavailableException;

    boolean isRegistrationCompleted(User user) throws ResourceUnavailableException;

}