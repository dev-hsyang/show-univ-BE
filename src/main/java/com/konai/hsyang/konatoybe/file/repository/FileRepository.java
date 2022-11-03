package com.konai.hsyang.konatoybe.file.repository;

import com.konai.hsyang.konatoybe.file.domain.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
