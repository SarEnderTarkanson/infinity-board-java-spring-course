package com.example.SpringSpecializationThirdCourse.repository;

import com.example.SpringSpecializationThirdCourse.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
