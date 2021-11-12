package com.mumu.bootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootDemoApplication.class, args);
    }

    @RequestMapping("get")
    public String geteee(@RequestBody Enti enti
//            @RequestParam(value = "aa")String aa,
//                         @RequestParam(value = "bb") String bb,
////                         @RequestBody ArrayList<HashMap<String,String>> cc
//                         @RequestParam String cc
    ){

//        return aa + bb+cc;
        return enti.toString();
    }

    @PostMapping("/page")
    public String geta(Pageable pageable){

        System.out.println(pageable);
        return "我的生活";
    }


}
