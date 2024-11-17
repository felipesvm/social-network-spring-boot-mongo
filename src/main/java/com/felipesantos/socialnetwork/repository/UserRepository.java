package com.felipesantos.socialnetwork.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.felipesantos.socialnetwork.domain.User;


@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
