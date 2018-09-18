package com.dagger4j.smallapp;


import com.dagger4j.vtor.annotation.*;

import java.util.Date;

/**
 * Hello world!
 *
 */
//@Bean
public class User implements java.io.Serializable{

    @DaggerId
    private String id;

    @Length(20)
    @NotEmpty
    private String name;

//    @Range(min = 50, max = 200)
    @Range({50, 200})
    private int age;

    @Length(11)
    private String phone;

    @Email
    private String email;


    @Ymd
    private Date  birthday;

    private String address;


    public User() {}

    public User(String id, String name, int age, String phone, String email, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
