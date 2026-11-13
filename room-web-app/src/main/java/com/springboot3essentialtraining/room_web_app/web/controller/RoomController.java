package com.springboot3essentialtraining.room_web_app.web.controller;

import com.springboot3essentialtraining.room_web_app.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String getRoomsPage(Model model){
        model.addAttribute("rooms", this.roomService.getAllRooms());
        return "rooms";
    }
}
