package com.codex.hackfest.student.repository;

import com.codex.hackfest.student.model.HackfestUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HackfestUserRepository extends MongoRepository<HackfestUser, String> {
}
