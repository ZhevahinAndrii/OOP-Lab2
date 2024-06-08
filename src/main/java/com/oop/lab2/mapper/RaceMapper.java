package com.oop.lab2.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.oop.lab2.dto.FlightDTO;
import com.oop.lab2.dto.RaceDTO;
import com.oop.lab2.entity.Flight;
import com.oop.lab2.entity.Race;

@Mapper
public interface RaceMapper {
    RaceMapper INSTANCE = Mappers.getMapper(RaceMapper.class);

    RaceDTO toDTO(Race obj);
    Race fromDTO(RaceDTO dto);
}