package com.example.repositories;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by prengifo on 21/12/2016.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
