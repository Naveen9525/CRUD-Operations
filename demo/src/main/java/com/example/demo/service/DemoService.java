package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Demo;

public interface DemoService
{
String create(Demo demo);
String update(Demo demo,int id);
String delete(long id);
List<Demo> findAll();
Object findById(long id);
}
