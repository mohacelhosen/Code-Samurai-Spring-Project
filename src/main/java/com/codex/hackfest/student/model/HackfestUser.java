package com.codex.hackfest.student.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class HackfestUser {
    @Id
    private String id;

    private Long devUserId;
    private String name;
    private String email;
    private String gender;
    private Integer age;
    private String password;
}
