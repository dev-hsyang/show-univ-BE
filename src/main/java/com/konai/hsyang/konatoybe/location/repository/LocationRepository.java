package com.konai.hsyang.konatoybe.location.repository;

import com.konai.hsyang.konatoybe.location.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
