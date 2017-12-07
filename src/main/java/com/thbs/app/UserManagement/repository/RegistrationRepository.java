package com.thbs.app.UserManagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.thbs.app.UserManagement.document.Registration;

@Repository
public interface RegistrationRepository extends MongoRepository<Registration, String> {

}
