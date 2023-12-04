package com.qf.firstspringboot.mapper;

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
}