package kosta.strarware.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kosta.starware.domain.ProjectVO;

public interface Project {
	
	public List<ProjectVO> getList();
	
	public void projcetInsert(ProjectVO project);
	
	public void insertSelectKey(ProjectVO project);
	
	public ProjectVO projectRead(int project_No);
	
	public int projectDelete(int project_No);
	
	public int projectUpdate(ProjectVO project);

}
