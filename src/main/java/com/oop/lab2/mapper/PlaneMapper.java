package com.oop.lab2.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.oop.lab2.dto.FlightDTO;
import com.oop.lab2.dto.PlaneDTO;
import com.oop.lab2.entity.Flight;
import com.oop.lab2.entity.Plane;

@Mapper
public interface PlaneMapper {
    PlaneMapper INSTANCE = Mappers.getMapper(PlaneMapper.class);

    PlaneDTO toDTO(Plane obj);
    Plane fromDTO(PlaneDTO dto);
}