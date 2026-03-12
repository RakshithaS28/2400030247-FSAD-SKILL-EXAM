package com.klef.fsad.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.fsad.exam.entity.Order;

public interface UserRepository extends JpaRepository<Order, Long>  {

}
