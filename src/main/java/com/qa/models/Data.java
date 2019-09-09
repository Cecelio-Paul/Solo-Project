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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayer_Name() {
        return player_Name;
    }

    public void setPlayer_Name(String player_Name) {
        this.player_Name = player_Name;
    }

    public String getPlayer_Position() {
        return player_Position;
    }

    public void setPlayer_Position(String player_Position) {
        this.player_Position = player_Position;
    }

    public Integer getNumber_Of_BigBlinds() {
        return number_Of_BigBlinds;
    }

    public void setNumber_Of_BigBlinds(Integer number_Of_BigBlinds) {
        this.number_Of_BigBlinds = number_Of_BigBlinds;
    }

    private String player_Name;
    private String player_Position;
    private Integer number_Of_BigBlinds;


}

