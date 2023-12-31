package com.qf.firstspringboot.mapper;

import com.qf.firstspringboot.entity.District;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DistrictMapper {
    @Select("select * from district")
    List<District> findAll();

    @Select("select * from district where id = #{id}")
    District findOneById(@Param("id") Integer id);
}
