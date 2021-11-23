package com.project.network.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profile")
@Data
public class Profile {

    @Id
    public String id;

    public String firstName;
    public String secondName;

}
