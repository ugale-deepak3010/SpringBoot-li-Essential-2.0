package com._TheymeLeaf_Pract1.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com._TheymeLeaf_Pract1.Model.Room;

@Service
public class RoomService {
	
	private static final List<Room> rooms = new ArrayList<>();
	static {
		for(int i=0;i<=10;i++) {
			rooms.add(new Room(i, "Room-"+i, "R"+i, "Q"+i));
		}
	}
	
	public List<Room> getAllRoom() {
		return rooms;
	}
}
