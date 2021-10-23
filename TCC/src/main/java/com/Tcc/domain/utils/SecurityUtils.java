package com.Tcc.domain.utils;

import com.google.common.hash.Hashing;
import java.nio.charset.StandardCharsets;
import org.springframework.stereotype.Component;

@Component
public class SecurityUtils {

    public String encodePass(String passwd) {
        String sha256hex = Hashing.sha256()
                .hashString(passwd, StandardCharsets.UTF_8)
                .toString();
        return sha256hex;
    }

    public boolean verificaPasswd(String password) {

        boolean hasLetter = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char x = password.charAt(i);
            if (Character.isLetter(x)) {
                hasLetter = true;
            } else if (Character.isDigit(x)) {
                hasDigit = true;
            }
            if (hasLetter && hasDigit) {
                break;
            }
        }
        if (hasLetter && hasDigit) {
            return true;
        } else {
            return false;
        }
    }
}
