package com.frankmoley.lil.sbet.landon.roomwebapp.controllers;

import java.util.List;

import com.frankmoley.lil.sbet.landon.roomwebapp.models.Room;
import com.frankmoley.lil.sbet.landon.roomwebapp.service.RoomService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {
    private final RoomService roomService;

    public RoomRestController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }
}
