package com.example.web.dao;

import com.example.web.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TestDao {

    @Results({
            @Result(property = "id", column = "id",javaType = String.class),
            @Result(property = "parent_id",column = "parent",javaType = String.class),
            @Result(property = "parent_ids",column = "parentIds",javaType = String.class),
            @Result(property = "area_id",column = "area",javaType = String.class),
            @Result(property = "code",column = "code",javaType = String.class),
            @Result(property = "name",column = "name",javaType = String.class),
//            @Result(property = "sort",column = "sort",javaType = String.class),
            @Result(property = "address",column = "address",javaType = String.class)
    })
    @Select("select * from sys_office")
    List<TestEntity> selectAll(String sex);







}
