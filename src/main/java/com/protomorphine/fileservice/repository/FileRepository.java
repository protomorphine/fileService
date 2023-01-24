package com.protomorphine.fileservice.repository;

import com.protomorphine.fileservice.model.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface FileRepository extends JpaRepository<File, UUID> {
}
