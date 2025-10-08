package com.estudando.curso.repositories;

import com.estudando.curso.entities.OrderItem;
import com.estudando.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
