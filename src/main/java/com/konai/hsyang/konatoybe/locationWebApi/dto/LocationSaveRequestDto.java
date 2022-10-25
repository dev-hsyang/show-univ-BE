package com.konai.hsyang.konatoybe.locationWebApi.dto;

import com.konai.hsyang.konatoybe.locationWebApi.domain.Location;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LocationSaveRequestDto {

    private Double latitude;
    private Double longtitude;

    @Builder
    public LocationSaveRequestDto(Double lat, Double lng) {
        this.latitude = lat;
        this.longtitude = lng;
    }

    public Location toEntity(){
        return Location.builder()
                .latitude(latitude)
                .longtitude(longtitude)
                .build();
    }
}
