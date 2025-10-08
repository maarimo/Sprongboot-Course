package com.estudando.curso.repositories;

import com.estudando.curso.entities.Category;
import com.estudando.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
