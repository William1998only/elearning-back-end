package com.lawencon.elearning.dto.forum;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *  @author Dzaky Fadhilla Guci
 */

@Data
@AllArgsConstructor
@JsonInclude(Include.NON_NULL)
public class ForumModuleResponseDTO {

  private String id;

  private String code;

  private String content;

  private LocalDateTime createdAt;

  private String userId;

  private String firstName;

  private String lastName;

  private String roleCode;

  private String photoId;

}
