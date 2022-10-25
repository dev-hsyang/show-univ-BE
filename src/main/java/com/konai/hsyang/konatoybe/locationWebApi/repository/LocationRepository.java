package com.konai.hsyang.konatoybe.locationWebApi.repository;

import com.konai.hsyang.konatoybe.locationWebApi.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
