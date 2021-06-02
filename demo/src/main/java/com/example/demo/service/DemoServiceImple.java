package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Demo;
import com.example.demo.repository.DemoRepository;

@Service
public class DemoServiceImple implements DemoService
{

	@Autowired
	DemoRepository demoRepository;
	
	@Override
	public String create(Demo demo) {
		 demoRepository.save(demo);
		 return "Save Data Successfully";
	}

	@Override
	public String update(Demo demo,int id) {
		demoRepository.save(demo);
		return "Update Data Successfully";
	}

	@Override
	public String delete(long id) {
		demoRepository.deleteById(id);
		return "Delete Success";
	}
	
	@Override
	public List<Demo> findAll() {
		return demoRepository.findAll();
	}
}
