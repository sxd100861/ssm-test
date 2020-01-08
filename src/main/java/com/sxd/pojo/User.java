package com.sxd.pojo;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.util.Date;
@Data
public class User {
   private int user_id;
   private String username;
   @JsonSerialize(include= JsonSerialize.Inclusion.NON_EMPTY)
   private int password;
   @JsonSerialize(include= JsonSerialize.Inclusion.NON_EMPTY)
   private int role_id;
   @JsonSerialize(include= JsonSerialize.Inclusion.NON_EMPTY)
   private Date create_time;

}
