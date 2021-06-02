package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Demo;

public interface DemoService
{
String create(Demo demo);
String update(Demo demo,Long id);
String delete(Demo demo,Long id);
List<Demo> findAll();
}
