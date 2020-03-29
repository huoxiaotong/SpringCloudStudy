package com.mumu.validation.code;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @ClassName: ValidationController
 * @Description: TODO
 * @Author: huo
 * @Date: 2019/1/10 16:05
 * @Version: 1.0
 */
@RestController
public class ValidationController {


    @GetMapping("va1")
    public String validationData(@Valid ValidationBean valid, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                System.out.println(fieldError);
            }
            return "fail";
        }
        return "hello word !name=张三,port=10";
    }

}
