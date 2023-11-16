package com._TheymeLeaf_Pract1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com._TheymeLeaf_Pract1.Service.StaffService;

@Controller
@RequestMapping("/staff")
public class StaffController {

	private StaffService staffService;
	
	public StaffController(StaffService staffService) {
		this.staffService = staffService;
	}
	
	@GetMapping
	public String GetAllStaffDetails(Model model) {
		model.addAttribute("staff", staffService.getAllStaffs() );
		return "staff";
	}
}
