package com.annaalmada.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.annaalmada.course.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
