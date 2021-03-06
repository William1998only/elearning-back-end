package com.lawencon.elearning.service;

import java.util.List;
import com.lawencon.elearning.dto.UpdateIsActiveRequestDTO;
import com.lawencon.elearning.dto.schedule.ScheduleResponseDTO;
import com.lawencon.elearning.model.Schedule;

/**
 *  @author Dzaky Fadhilla Guci
 */

public interface ScheduleService {

  List<Schedule> getAllSchedules() throws Exception;

  void saveSchedule(Schedule data) throws Exception;

  void updateSchedule(Schedule data) throws Exception;

  Schedule findScheduleById(String id) throws Exception;

  Schedule getByIdCustom(String id) throws Exception;

  List<ScheduleResponseDTO> getByTeacherId(String teacherId) throws Exception;

  void deleteSchedule(String id) throws Exception;

  void updateIsActive(UpdateIsActiveRequestDTO request) throws Exception;



}
