package com.SpringBootJpa.SpringBootJpa.model.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users2 {
    @Id
    private Long id;
    private String userName;

    public Users2() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Users2{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
}
