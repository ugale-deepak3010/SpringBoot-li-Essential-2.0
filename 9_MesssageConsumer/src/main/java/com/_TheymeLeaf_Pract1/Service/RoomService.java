package com._TheymeLeaf_Pract1.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com._TheymeLeaf_Pract1.Data.RoomRepository;
import com._TheymeLeaf_Pract1.Model.Room;

@Service
public class RoomService {
	
	private final RoomRepository roomRepository;
	
	public RoomService(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}

	public List<Room> getAllRoom() {
		return roomRepository.findAll();
	}
	
	public Room getByIdRoom(long id) {
		
			return roomRepository.findById(id).get();
	}
}
