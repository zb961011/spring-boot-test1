package com.example.web.controller;

import com.example.web.dao.TestDao;
import com.example.web.entity.TestEntity;
import com.example.web.service.ITestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Api(value = "PageController", description = "用户登录登出接口")
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestDao service;


    @ApiOperation(value="查询用户接口", notes="用户登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "企业名", required = true ,dataType = "string"),
            @ApiImplicitParam(name = "code", value = "企业编号", required = true ,dataType = "string")
    })
    @ResponseBody
    @RequestMapping(value = "/login",method = {RequestMethod.POST,RequestMethod.GET})
    public List<TestEntity> selectAll(HttpServletRequest request) {
        return service.selectAll("男");
    }

}
