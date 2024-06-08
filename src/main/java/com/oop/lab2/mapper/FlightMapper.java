package com.oop.lab2.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.oop.lab2.dto.CrewDTO;
import com.oop.lab2.dto.FlightDTO;
import com.oop.lab2.entity.Crewmate;
import com.oop.lab2.entity.Flight;

@Mapper
public interface FlightMapper {
    FlightMapper INSTANCE = Mappers.getMapper(FlightMapper.class);

    FlightDTO toDTO(Flight obj);
    Flight fromDTO(FlightDTO dto);
}