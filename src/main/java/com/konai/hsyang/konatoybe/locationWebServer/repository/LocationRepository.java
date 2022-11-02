package com.konai.hsyang.konatoybe.locationWebServer.repository;

import com.konai.hsyang.konatoybe.locationWebServer.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
