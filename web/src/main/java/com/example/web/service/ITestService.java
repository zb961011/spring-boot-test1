package com.example.web.service;

import com.example.web.entity.TestEntity;

import java.util.List;

public interface ITestService {

    List<TestEntity> selectAll(String sex);

}
