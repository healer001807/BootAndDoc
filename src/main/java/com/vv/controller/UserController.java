package com.vv.controller;

import com.vv.pojo.UserDTO;
import com.vv.util.ResUtils;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

/**
 * @author kw
 * @program
 * @description
 * @create 2023 - 06 - 22 11:32
 **/
@Tag(name = "UserController", description = "用户api")
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping
    public ResUtils getUserList() {
        return new ResUtils<>();
    }

    @PostMapping("save")
    public String save(@RequestBody UserDTO userDTO) {
        return "0000";
    }
}
