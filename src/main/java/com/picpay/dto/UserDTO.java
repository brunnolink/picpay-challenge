package com.picpay.dto;

import com.picpay.enumeration.UserType;

import java.math.BigDecimal;

public record UserDTO(
        String firstName,
        String lastName,
        String document,
        String email,
        BigDecimal balance,
        UserType userType,
        String password) {
}
