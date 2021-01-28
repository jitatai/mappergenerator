package com.jt.controller;

import com.jt.pojo.Result;
import com.jt.pojo.kUser;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * Swagger2测试接口
 *
 * @author qiyu
 * @date 2020-09-20 17:13
 */
@RestController
@Slf4j
@Api(tags = "用户接口")
@ApiResponses({
        @ApiResponse(code = -1, message = "网络错误"),
        @ApiResponse(code = 200, message = "成功"),
        @ApiResponse(code = 910, message = "token为空"),
        @ApiResponse(code = 911, message = "token无效")
})
public class UserController {

    /**
     * 新增用户
     * @param user
     * @return
     */
    @ApiOperation(value = "新增用户")
    @PostMapping("/addUser")
    public Result addUser(@RequestBody kUser user) {
        log.info("user:{}", user);
        return Result.success(user);
    }

    /**
     * 根据用户名和年龄获取用户
     *
     * @param name
     * @param age
     * @return
     */
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "名字", dataType = "String", paramType = "query", required = true),
            @ApiImplicitParam(name = "age", value = "年龄", dataType = "Integer", paramType = "query", required = true)
    })
    @ApiOperation(value = "根据用户名和年龄获取用户")
    @GetMapping("/getUserByNameAndAge")
    public Result getUserByNameAndAge(@RequestParam String name, @RequestParam Integer age) {
        log.info("name:{}, age:{}", name, age);
        return Result.success(new kUser());
    }
}