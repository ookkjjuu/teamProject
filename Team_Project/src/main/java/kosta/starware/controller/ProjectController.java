package kosta.starware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kosta.starware.domain.ProjectVO;
import kosta.starware.service.ProjectService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/project/*")
@AllArgsConstructor
public class ProjectController {
	
	private ProjectService service;
	
	@GetMapping("/projectListForm")
	public void list(Model model){
		
		log.info("list");
		
		model.addAttribute("list" , service.getList());
	}

	@PostMapping("/insert")
	public String insert(ProjectVO project, RedirectAttributes rttr){
		
		log.info("insert:" + project);
		
		service.insert(project);
		
		rttr.addFlashAttribute("result", project.getProject_No());
		
		return "redirect:/project/list";
	}
	
	@GetMapping("/get")
	public void get(@RequestParam("project_No")int project_No, Model model){
		
		log.info("/get");
		model.addAttribute("project", service.get(project_No));
	}
	
}
