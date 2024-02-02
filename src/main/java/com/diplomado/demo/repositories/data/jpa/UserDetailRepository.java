package com.diplomado.demo.repositories.data.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diplomado.demo.models.UserDetailEntity;
import com.diplomado.demo.models.UserEntity;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetailEntity, Long> {
    UserDetailEntity findByUser(UserEntity user);
}
