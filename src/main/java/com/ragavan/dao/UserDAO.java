package com.ragavan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ragavan.modal.User;

public interface UserDAO extends JpaRepository<User, Long> {

}
