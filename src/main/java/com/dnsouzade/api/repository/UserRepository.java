package com.dnsouzade.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dnsouzade.api.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
