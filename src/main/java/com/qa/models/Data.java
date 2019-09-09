package com.qa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Data {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Player_Name;
    private String Player_Position;
    private Integer Number_Of_BigBlinds;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayer_Name() {
        return Player_Name;
    }

    public void setPlayer_Name(String player_Name) {
        Player_Name = player_Name;
    }

    public String getPlayer_Position() {
        return Player_Position;
    }

    public void setPlayer_Position(String player_Position) {
        Player_Position = player_Position;
    }

    public Integer getNumber_Of_BigBlinds() {
        return Number_Of_BigBlinds;
    }

    public void setNumber_Of_BigBlinds(Integer number_Of_BigBlinds) {
        Number_Of_BigBlinds = number_Of_BigBlinds;
    }
}

