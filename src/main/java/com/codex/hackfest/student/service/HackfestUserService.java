package com.codex.hackfest.student.service;

import com.codex.hackfest.student.dto.UserDto;
import com.codex.hackfest.student.model.HackfestUser;
import com.codex.hackfest.student.repository.HackfestUserRepository;
import com.codex.hackfest.util.Dto2Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HackfestUserService {

    private final HackfestUserRepository hackfestUserRepository;

    @Autowired
    public HackfestUserService(HackfestUserRepository hackfestUserRepository){
        this.hackfestUserRepository=hackfestUserRepository;
    }

    public HackfestUser saveUser(UserDto userDto )  {
        HackfestUser hackfestUser = Dto2Model.userDto2HackfestModel(userDto);
        return hackfestUserRepository.save(hackfestUser);
    }
}
