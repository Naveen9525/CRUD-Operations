package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Demo;
import com.example.demo.service.DemoService;

@RestController
public class DemoController
{
@Autowired
DemoService demoService;

@PostMapping("/save")
public String post(@RequestBody Demo demo)
{
	return demoService.create(demo);
}

@PutMapping("/update/{id}")
public String update(@PathVariable("id") int id,@RequestBody Demo demo)
{
	return demoService.update(demo,id);
}

@DeleteMapping("/delete/{id}")
public String delete(@PathVariable("id") long id)
{
	return demoService.delete(id);
}

@GetMapping("/get")
public List<Demo> findAll()
{
	return demoService.findAll();
}

@GetMapping("/get/{id}")
public Object findById(@PathVariable("id") long id)
{
	return demoService.findById(id);
}

}
