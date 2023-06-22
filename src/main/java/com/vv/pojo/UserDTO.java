package com.vv.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author kw
 * @program
 * @description
 * @create 2023 - 06 - 22 11:21
 **/
@Data
@Schema(name = "UserDTO", description = "用户实体")
public class UserDTO {
    @Schema(name = "userId", description = "用户流水号")
    private String userId;
    @Schema(name = "userName", description = "用户流水号")
    private String userName;
}
