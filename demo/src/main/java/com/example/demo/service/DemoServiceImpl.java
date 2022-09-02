package com.example.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
@Service
@AllArgsConstructor
public class DemoServiceImpl implements DemoService{

    @Autowired
    private Environment env;

    @Override
    public String getUrl()
    {
        return env.getProperty("database.url");
    }


}
