package com.konai.hsyang.konatoybe.locationWebApi.api;

import com.konai.hsyang.konatoybe.locationWebApi.dto.LocationResponseDto;
import com.konai.hsyang.konatoybe.locationWebApi.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class LocationWebApi {

    private final LocationService locationService;

    @GetMapping("/api/location/{id}")
    public LocationResponseDto findById(@PathVariable Long id){

        return locationService.findByID(id);
    }
}
