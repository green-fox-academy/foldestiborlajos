package com.project.foxclub.services;


import com.project.foxclub.model.Fox;
import java.util.HashMap;
import org.springframework.stereotype.Component;

@Component
public class PasswordService {

  public HashMap<Fox, String> passwords = new HashMap<>();
  public String passwordToken = "";
  public boolean passwordFail = false;

  public String sendWrongPasswordMessage() {
    return "Your has gave a wrong password. Try again";
  }

  public boolean validiatePassword(Fox inputFox, String inputPassword) {
    return this.passwords.keySet().stream()
        .filter(key -> key.equals(inputFox))
        .anyMatch(key -> passwords.get(key).equals(inputPassword));
  }

  public String rememberPassword(String string) {
    return this.passwordToken = string;
  }

  public boolean isPasswordFail() {
    return passwordFail;
  }

  public void setPasswordFail(boolean passwordFail) {
    this.passwordFail = passwordFail;
  }
}
