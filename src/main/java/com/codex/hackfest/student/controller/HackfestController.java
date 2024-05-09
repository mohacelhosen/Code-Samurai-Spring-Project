package com.codex.hackfest.student.controller;

import com.codex.hackfest.student.dto.UserDto;
import com.codex.hackfest.student.model.HackfestUser;
import com.codex.hackfest.student.service.HackfestUserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class HackfestController {

    private final HackfestUserService hackfestUserService;

    @Autowired
    public HackfestController(HackfestUserService hackfestUserService){
        this.hackfestUserService=hackfestUserService;
    }
    @PostMapping("/user")
    public ResponseEntity<?> saveUser(@Valid  @RequestBody UserDto userDto)  {
        HackfestUser hackfestUser = hackfestUserService.saveUser(userDto);
        return new ResponseEntity<>(hackfestUser, HttpStatus.CREATED);
    }
}
