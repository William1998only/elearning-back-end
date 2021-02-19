package com.lawencon.elearning.service;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import com.lawencon.elearning.dto.UpdatePasswordRequestDTO;
import com.lawencon.elearning.model.User;

/**
 * @author Rian Rivaldo
 */
public interface UserService {

  void addUser(User user) throws Exception;

  User getById(String id) throws Exception;

  User getByUsername(String username) throws Exception;

  void updateUser(User user) throws Exception;

  void updateActivateStatus(String id, boolean status, String updatedBy) throws Exception;

  String getUserRoleId(String userId) throws Exception;

  void deleteById(String id) throws Exception;

  void updatePasswordUser(UpdatePasswordRequestDTO request) throws Exception;

  void resetPassword(String email) throws Exception;

  List<String> getEmailUsersPerModule(String idModule) throws Exception;

  void saveUserPhoto(MultipartFile file, String content) throws Exception;

}
