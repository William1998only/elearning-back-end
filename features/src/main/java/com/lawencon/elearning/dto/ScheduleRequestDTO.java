package com.lawencon.elearning.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author : Galih Dika Permana
 */
@Data
public class ScheduleRequestDTO {

  @NotNull
  private LocalDate scheduleDate;
  @NotNull
  private LocalTime scheduleStart;
  @NotNull
  private LocalTime scheduleEnd;
  @NotBlank
  private String scheduleCreatedBy;

  @NotBlank
  private String teacherId;
  @NotNull
  @Min(0)
  private Long teacherVersion;
}