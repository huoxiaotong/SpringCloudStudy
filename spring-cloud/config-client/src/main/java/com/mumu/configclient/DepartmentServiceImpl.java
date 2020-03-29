package com.mumu.configclient;

import javafx.scene.control.Pagination;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 姜向前
 * @Date: 2018/5/31 14:10
 * @Description: 部门管理 ServiceImpl
 */
@Service("hrDepartmentServiceImpl")
public class DepartmentServiceImpl implements DepartmentService {
    private Logger logger = LoggerFactory.getLogger(DepartmentServiceImpl.class);
    @Autowired
    private DepartmentMapper hrDepartmentMapper;

    /**
     * @return com.ehean.bean.Department
     * @description 根据id查询数据
     * @param: * @param id
     * @author 姜向前
     * @date 2018/5/31 14:18
     */
    @Override
    public Department selectByPrimaryKey(Integer id) {
        return hrDepartmentMapper.selectByPrimaryKey(id);
    }
}
