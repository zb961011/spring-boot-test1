package com.example.web.service;

import com.example.web.dao.TestDao;
import com.example.web.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService implements ITestService {

    @Autowired
    TestDao testDao;

    @Override
    public List<TestEntity> selectAll(String sex) {
        return testDao.selectAll(sex);
    }
}
