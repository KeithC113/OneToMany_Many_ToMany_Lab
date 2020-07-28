package com.codeclan.example.FileFolderUser.repository;

import com.codeclan.example.FileFolderUser.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
