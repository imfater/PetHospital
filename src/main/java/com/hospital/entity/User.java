package com.hospital.entity;

import lombok.Data;

import javax.persistence.*;


/**
 * Created by Jimmy on 2017/3/11.
 */
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long id;

  //  @Column(name = "created")
    //private Long created = System.currentTimeMillis();

    @Column(name = "user_name")
    private String name;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "user_pwd")
    private String password;

    @Column(name = "user_type")
    private int type;
}