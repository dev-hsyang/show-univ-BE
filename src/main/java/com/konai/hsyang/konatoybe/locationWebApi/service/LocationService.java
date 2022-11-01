package com.konai.hsyang.konatoybe.locationWebApi.service;

import com.konai.hsyang.konatoybe.exceptions.NoLocationFoundException;
import com.konai.hsyang.konatoybe.locationWebApi.domain.Location;
import com.konai.hsyang.konatoybe.locationWebApi.dto.LocationResponseDto;
import com.konai.hsyang.konatoybe.locationWebApi.dto.LocationSaveRequestDto;
import com.konai.hsyang.konatoybe.locationWebApi.repository.LocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class LocationService {

    private final LocationRepository locationRepository;


    public Location findById(Long id){

        return locationRepository.findById(id).orElseThrow(() -> new NoLocationFoundException());
    }
    @Transactional
    public Long save(LocationSaveRequestDto requestDto) {

        return locationRepository.save(requestDto.toEntity()).getLocationID();
    }

    @Transactional
    public void delete(Long id) {

        locationRepository.delete(locationRepository.findById(id).orElseThrow(() -> new NoLocationFoundException()));
    }

    public LocationResponseDto responseDtoFindByID(Long id) {

        return new LocationResponseDto(locationRepository.findById(id).orElseThrow(() -> new NoLocationFoundException()));
    }
}
