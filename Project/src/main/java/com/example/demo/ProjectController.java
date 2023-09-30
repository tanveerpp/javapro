package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Project;
import com.example.demo.service.ProjectService;

@RestController
public class ProjectController {
@Autowired
ProjectService service;
@GetMapping("/project/{pid}")
public Project getPro(@PathVariable("pid") int pid)
{
	return service.getProDetails(pid);
}
}
