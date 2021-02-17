package com.lawencon.elearning.controller;

import com.lawencon.elearning.dto.UpdatePasswordRequestDTO;
import com.lawencon.elearning.service.UserService;
import com.lawencon.elearning.util.WebResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Dzaky Fadhilla Guci
 */

@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @PatchMapping("/user/update-password")
  public ResponseEntity<?> updatePassword(@RequestBody UpdatePasswordRequestDTO request)
      throws Exception {
    userService.updatePasswordUser(request);
    return WebResponseUtils.createWebResponse("Update Password Success", HttpStatus.OK);
  }

  @PatchMapping("/user/forget-password")
  public ResponseEntity<?> forgetPassword(@RequestParam("email") String email) throws Exception {
    userService.resetPassword(email);
    return WebResponseUtils.createWebResponse("Reset Password Success", HttpStatus.OK);
  }

  @PutMapping(value = {"/user/photo"})
  public ResponseEntity<?> saveUserPhoto(@RequestPart("file") MultipartFile file,
      @RequestPart("content") String content)
      throws Exception {
    userService.saveUserPhoto(file, content);
    return WebResponseUtils
        .createWebResponse("User photo has been saved successfully.", HttpStatus.OK);
  }

}
