package com.DoctorMicroservices.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.DoctorMicroservices.model.Doctor;

public interface DoctorRepository extends MongoRepository<Doctor, String> {

}
