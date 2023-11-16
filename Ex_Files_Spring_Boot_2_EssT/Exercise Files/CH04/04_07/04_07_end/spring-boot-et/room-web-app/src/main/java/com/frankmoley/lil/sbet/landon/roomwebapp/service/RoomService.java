package com.frankmoley.lil.sbet.landon.roomwebapp.service;

import java.util.ArrayList;
import java.util.List;

import com.frankmoley.lil.sbet.landon.roomwebapp.data.RoomRepository;
import com.frankmoley.lil.sbet.landon.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }
}