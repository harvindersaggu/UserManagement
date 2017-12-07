package com.thbs.app.UserManagement.repository;

import org.springframework.stereotype.Repository;

import com.thbs.app.UserManagement.document.DeliveryStatus;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface DeliveryStatusRepository extends MongoRepository<DeliveryStatus, Integer> {

}
