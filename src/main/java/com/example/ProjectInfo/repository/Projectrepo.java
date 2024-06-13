package com.example.ProjectInfo.repository;

import com.example.ProjectInfo.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Projectrepo  extends MongoRepository<Project,String> {
}
