package com.hanabi.hanabibackend.controller;

import com.hanabi.hanabibackend.common.BaseResponse;
import com.hanabi.hanabibackend.common.ResultUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    /**
     * 测试接口
     *
     * @return
     */
    @RequestMapping("/good")
    public BaseResponse<String> good() {
        return ResultUtils.success("ok");
    }
}
