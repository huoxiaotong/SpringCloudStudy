package com.mumu.configclient;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("dp")
public class DepartmentController {

    private Logger logger = LoggerFactory.getLogger(DepartmentController.class);
    @Autowired
    private DepartmentService departmentService;


    @RequestMapping( value = "/info", method= RequestMethod.GET )
    public Department getTypeEnum(@Param("id")Integer id){
        Department department = departmentService.selectByPrimaryKey(id);
        return department;
    }
}