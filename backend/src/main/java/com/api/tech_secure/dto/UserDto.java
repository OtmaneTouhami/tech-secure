package com.api.tech_secure.dto;

import com.api.tech_secure.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.api.tech_secure.model.User}
 */
@Value
@Data
@AllArgsConstructor
public class UserDto implements Serializable {
    Long id;
    String username;
    String firstName;
    String lastName;
    String email;
    String password;
    User.Role role;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}