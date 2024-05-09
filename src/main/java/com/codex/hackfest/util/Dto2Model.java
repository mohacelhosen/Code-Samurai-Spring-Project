package com.codex.hackfest.util;

import com.codex.hackfest.student.dto.UserDto;
import com.codex.hackfest.student.model.HackfestUser;

import java.util.UUID;

public class Dto2Model {

    public static HackfestUser userDto2HackfestModel(UserDto userDto){
        HackfestUser modelUser = new HackfestUser();

        if (userDto.getName() !=null && !userDto.getName().isBlank()){
            modelUser.setName(userDto.getName());
        }

        if (userDto.getAge() != 0 && userDto.getAge() >0){
            modelUser.setAge(userDto.getAge());
        }

        if (userDto.getEmail() !=null && !userDto.getEmail().isBlank()){
            modelUser.setEmail(userDto.getEmail());
        }

        if (userDto.getGender() !=null && !userDto.getGender().isBlank()){
            modelUser.setGender(userDto.getGender());
        }

        if (userDto.getPassword() !=null && !userDto.getPassword().isBlank()){
            modelUser.setPassword(userDto.getPassword());
        }
        modelUser.setDevUserId(UUID.randomUUID().getMostSignificantBits());

        return modelUser;
    }
}
