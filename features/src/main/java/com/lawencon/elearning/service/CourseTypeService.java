package com.lawencon.elearning.service;

import java.util.List;
import com.lawencon.elearning.dto.course.type.CourseTypeCreateRequestDTO;
import com.lawencon.elearning.dto.course.type.CourseTypeDeleteRequestDTO;
import com.lawencon.elearning.dto.course.type.CourseTypeResponseDTO;
import com.lawencon.elearning.dto.course.type.CourseTypeUpdateRequestDTO;

/**
 * @author : Galih Dika Permana
 */

public interface CourseTypeService {

  List<CourseTypeResponseDTO> getListCourseType() throws Exception;

  void insertCourseType(CourseTypeCreateRequestDTO courseType) throws Exception;

  void updateCourseType(CourseTypeUpdateRequestDTO courseType) throws Exception;

  void deleteCourseType(CourseTypeDeleteRequestDTO courseTypeDeleteDTO) throws Exception;

  void updateIsActive(String id, String userId) throws Exception;
}
