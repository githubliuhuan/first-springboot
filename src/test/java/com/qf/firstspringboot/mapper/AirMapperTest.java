package com.qf.firstspringboot.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.firstspringboot.FirstSpringbootApplicationTests;
import com.qf.firstspringboot.entity.Air;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * @author haun
 * @version 1.0.0
 * @date 2023/12/3 17:32
 */
class AirMapperTest extends FirstSpringbootApplicationTests {

    @Autowired
    private AirMapper airMapper;

    @Test
    void findAll() {
        List<Air> list = airMapper.findAll();
        for (Air air : list) {
            System.out.println(air);

        }
    }

    @Test
    public void findByPage(){
        // 1.执行分页
        PageHelper.startPage(1,5);

        // 2.执行查询
        List<Air> list = airMapper.findAll();

        // 3.封装PageInfo对象
        PageInfo<Air> pageInfo = new PageInfo<>(list);

        // 4.输出
        for (Air air :
                pageInfo.getList()) {
            System.out.println(air);
        }
    }
}