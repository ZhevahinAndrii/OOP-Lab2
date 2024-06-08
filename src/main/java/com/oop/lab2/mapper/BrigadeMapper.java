package com.oop.lab2.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.oop.lab2.dto.BrigadeDTO;
import com.oop.lab2.entity.Brigade;

@Mapper
public interface BrigadeMapper {
    BrigadeMapper INSTANCE = Mappers.getMapper(BrigadeMapper.class);

    BrigadeDTO toDTO(Brigade brigade);
    Brigade fromDTO(BrigadeDTO dto);
}