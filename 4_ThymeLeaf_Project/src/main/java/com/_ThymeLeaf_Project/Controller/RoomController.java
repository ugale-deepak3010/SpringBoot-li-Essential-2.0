package com._ThymeLeaf_Project.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com._ThymeLeaf_Project.Model.Room;


@Controller
@RequestMapping("/rooms")
public class RoomController {
	
	private static final List<Room> rooms = new ArrayList<>() ;
	static {
		for(int i=0;i<=10;i++) {
			rooms.add(new Room(i, "Room "+i, "R"+i, "Q"+i) );
		}
	}
	
	@GetMapping
	public String getAllRoom(Model model) {
		model.addAttribute("rooms", rooms);		// first room is refer in view
		return "rooms";
	}
	
	
}
