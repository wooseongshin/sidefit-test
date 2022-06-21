package com.sidefit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;

@Entity
@Getter
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

}
