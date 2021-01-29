package com.lawencon.elearning.dao;

import com.lawencon.elearning.model.Student;
import com.lawencon.util.Callback;
import java.util.List;

/**
 * 
 * @author WILLIAM
 *
 */
public interface StudentDao {

  void insertStudent(Student data, Callback before) throws Exception;

  Student getStudentById(String id) throws Exception;

  Student getStudentProfile(String id) throws Exception;

  Student getStudentByIdUser(String id) throws Exception;

  void updateStudentProfile(Student data, Callback before) throws Exception;

  void deleteStudentById(String id) throws Exception;

  void updateIsActive(String id, String userId) throws Exception;

  Student getStudentDashboard(String id) throws Exception;

  List<Student> findAll() throws Exception;
  
}
