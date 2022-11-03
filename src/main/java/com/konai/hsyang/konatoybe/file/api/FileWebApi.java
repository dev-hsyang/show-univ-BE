package com.konai.hsyang.konatoybe.file.api;

import com.konai.hsyang.konatoybe.file.domain.File;
import com.konai.hsyang.konatoybe.file.dto.FileSaveRequestDto;
import com.konai.hsyang.konatoybe.file.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class FileWebApi {

    private final FileService fileService;


    @PostMapping("/api/v2/file/save")
    public void uploadFile(@RequestBody FileSaveRequestDto requestDto) {

        fileService.save(requestDto);
    }

    @GetMapping("/api/v2/file/delete/{fileID}")
    public void deleteFile(@PathVariable Long fileID){

        fileService.deleteByID(fileID);
    }

    @GetMapping("/api/v2/file/{fileID}")
    public File findByID(@PathVariable Long fileID){

        return fileService.findById(fileID);
    }
}
