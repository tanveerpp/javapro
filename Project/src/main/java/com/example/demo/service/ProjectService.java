package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.beans.Project;
import com.example.demo.repo.ProjectRepo;

@Service
public class ProjectService implements ProjectRepo {

	@Override
	public Project getProDetails(int id) {
		Project p1=new Project(1145,"erp","corgo","sdksjdh");
		Project p2=new Project(1245,"arp","corgo1","sdksjdh1");
		Project p3=new Project(1345,"brp","corgo2","sdksjdh2");
		Project p4=new Project(1445,"crp","corgo3","sdksjdh3");
		Project p5=new Project(1745,"drp","corgo4","sdksjdh4");
		if(id==1145)
		{
			return p1;
		}else if(id==1245)
		{
			return p2;
		}else if(id==1345)
		{
			return p3;
		}else if(id==1445)
		{
			return p4;
		}else if(id==1745)
		{
			return p5;
		}
		else
		{
			return null;
		}
		
	}

}
