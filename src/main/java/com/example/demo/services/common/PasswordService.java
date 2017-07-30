package com.example.demo.services.common;

import org.pac4j.core.credentials.password.PasswordEncoder;
import org.pac4j.core.credentials.password.ShiroPasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class PasswordService {

    private static int workload = 12;

    public String hashPassword(String password) {
        String salt = BCrypt.gensalt(workload);
        return BCrypt.hashpw(password, salt);
    }


    public static boolean checkPassword(String passwordPlaintext, String storedHashPassword) {
        boolean password_verified = false;

        if(null == storedHashPassword || !storedHashPassword.startsWith("$2a$"))
            throw new java.lang.IllegalArgumentException("Invalid hash provided for comparison");

        password_verified = BCrypt.checkpw(passwordPlaintext, storedHashPassword);

        return(password_verified);
    }

}
