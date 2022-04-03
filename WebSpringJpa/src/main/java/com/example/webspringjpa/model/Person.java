package com.example.webspringjpa.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotEmpty(message = "Name input field is empty")
    @Size(min = 2,max = 20, message = "incorrect name size")
    private String name;
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")
    private String email;
    @Min(value = 0, message = "Age should be greater than 0")
    private int age;

    public Person( String name, String email, int age) {
        this.name = name;
        this.email= email;
        this.age= age;
    }
    public Person(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {return email;
    }

    public void setEmail(String email) {this.email = email;
    }

    public int getAge() {return age;
    }

    public void setAge(int age) {this.age = age;
    }
}