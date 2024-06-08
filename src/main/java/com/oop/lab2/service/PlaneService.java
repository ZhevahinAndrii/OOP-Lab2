package com.oop.lab2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.oop.lab2.dto.PlaneDTO;
import com.oop.lab2.entity.Plane;
import com.oop.lab2.mapper.PlaneMapper;
import com.oop.lab2.repository.PlaneRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PlaneService {
    private final PlaneRepo repository;
    private final PlaneMapper mapper = PlaneMapper.INSTANCE;
    public void update(PlaneDTO dto){
        Optional<Plane> record = repository.findById(dto.getId());
        if(record.isEmpty()){
            return;
        }
        Plane obj = record.get();
        obj.setModel(dto.getModel());
        obj.setMaxLuggage(dto.getMaxLuggage());
        obj.setPassengerSeats(dto.getPassengerSeats());
        obj.setMaxFlightInMins(dto.getMaxFlightInMins());
        repository.save(obj);
    }

    public void delete(String Id){
        if(repository.existsById(Id)){
            repository.deleteById(Id);
            repository.cascadeDelete(Id);
        }
    }

    public Optional<PlaneDTO> get(String Id){
        Optional<Plane> obj = repository.findById(Id);
        return obj.map(mapper::toDTO);
    }

    public List<PlaneDTO> getAll(){
        List<Plane> objs = repository.findAll();
        List<PlaneDTO> DTOs = new ArrayList<>();
        for (Plane o : objs){
            DTOs.add(mapper.toDTO(o));
        }
        return DTOs;
    }

    public List<PlaneDTO> getByModel(String name){
        Optional<List<Plane>> objs = repository.findByModel(name);
        if(objs.isEmpty()){
            return new ArrayList<>();
        }
        List<PlaneDTO> DTOs = new ArrayList<>();
        for (Plane o : objs.get()){
            DTOs.add(mapper.toDTO(o));
        }
        return DTOs;
    }

    public void create(PlaneDTO dto){
        dto.setId(UUID.randomUUID().toString());
        Plane o = mapper.fromDTO(dto);
        repository.save(o);
    }
}