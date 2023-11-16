package com._TheymeLeaf_Pract1.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com._TheymeLeaf_Pract1.Model.Staff;
import com._TheymeLeaf_Pract1.Service.StaffService;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {

	private StaffService staffService;
	
	public StaffRestController(StaffService staffService) {
		this.staffService = staffService;
	}

	@GetMapping
	public List<Staff> getAllStaffByAPI(){
		return staffService.getAllStaffs();
	}
}
