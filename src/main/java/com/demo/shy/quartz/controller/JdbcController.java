package com.demo.shy.quartz.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/jdbc")
public class JdbcController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/list")
    public void list(){
        List list = jdbcTemplate.queryForList("select * from qrtz_job_details");
        System.out.println(list.stream().findFirst().toString());
    }


}
