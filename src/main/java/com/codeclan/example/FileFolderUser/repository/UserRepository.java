package com.codeclan.example.FileFolderUser.repository;

import com.codeclan.example.FileFolderUser.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
