package com.example.SpringSpecializationThirdCourse.repository;

import com.example.SpringSpecializationThirdCourse.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
