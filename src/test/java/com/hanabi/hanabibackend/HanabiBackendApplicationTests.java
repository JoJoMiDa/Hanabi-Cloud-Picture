package com.hanabi.hanabibackend;

import com.hanabi.hanabibackend.common.BaseResponse;
import com.hanabi.hanabibackend.controller.MainController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootTest
class HanabiBackendApplicationTests {

    @Test
    void contextLoads() {

//        ErrorCode errorCode = ErrorCode.PARAMS_ERROR;
//        BusinessException businessException = new BusinessException(errorCode);
//        System.out.println("errorCode = " + errorCode.getCode() + "\n"+ "Message = " + errorCode.getMessage());
//        System.out.println("businessException = " + businessException.getCode() + "\n"+ "Message = " + businessException.getMessage());
    }

    @Test
    void test() {
        MainController mainController = new MainController();
        BaseResponse<String> result = mainController.good();
        System.out.println(result);
    }

}
