package com._TheymeLeaf_Pract1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com._TheymeLeaf_Pract1.Service.*;

@Controller
@RequestMapping("/rooms")
public class RoomsController {
	
	//RoomService rm= new RoomService();
	
	private RoomService roomService;
	
	
	
	public RoomsController(RoomService roomService) {
		
		this.roomService = roomService;
	}



	@GetMapping
	public String getAllRooms(Model model) {
		model.addAttribute("rooms", roomService.getAllRoom() );
		return "rooms";		// this rooms is view
	}
	
}
