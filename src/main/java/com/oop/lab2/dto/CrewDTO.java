package com.oop.lab2.dto;


import lombok.Data;
import com.oop.lab2.entity.Crewmate;
@Data
public class CrewDTO {
    private String Id;
    private String name;
    private String qualification;
    private String brigadeId;
}