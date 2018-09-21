package com.SpringBootJpa.SpringBootJpa.model.dao;

import com.SpringBootJpa.SpringBootJpa.model.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IUserDao extends CrudRepository<Users, Long> {

    public Users save(Users users);

}
