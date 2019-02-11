package kosta.starware.service;

import java.util.List;

import kosta.starware.domain.ProjectVO;

public interface ProjectService {

	public void insert(ProjectVO project); // register
	 
	public ProjectVO get(int project_No); // detail
	
	public boolean update(ProjectVO project); // modify
	
	public boolean delete(int project_No); // remove

	public List<ProjectVO> getList(); // list

}
