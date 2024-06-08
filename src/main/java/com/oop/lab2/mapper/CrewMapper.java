package com.oop.lab2.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.oop.lab2.dto.BrigadeDTO;
import com.oop.lab2.dto.CrewDTO;
import com.oop.lab2.entity.Brigade;
import com.oop.lab2.entity.Crewmate;

@Mapper
public interface CrewMapper {
    CrewMapper INSTANCE = Mappers.getMapper(CrewMapper.class);

    CrewDTO toDTO(Crewmate obj);
    Crewmate fromDTO(CrewDTO dto);
}