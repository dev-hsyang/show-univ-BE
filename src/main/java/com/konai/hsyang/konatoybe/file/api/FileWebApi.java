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

        File file = fileService.findById(fileID);
        System.out.println(file.getFileID());
        System.out.println(file.getPosts().getPostsID());
        System.out.println(file.getOrgfilename());
        System.out.println(file.getSavefilename());
        System.out.println(file.getStorepath());
        System.out.println(file.getFilesize());
        System.out.println("OrgFileName================" + fileService.findById(fileID).getOrgfilename());
        return fileService.findById(fileID);
        // RestController 어노테이션이 붙은 컨트롤러에서 값을 반환하면 객체를 JSON으로 ObjectMapper가 변환시켜준다.
        // 여기서 JSON타입에 대한 무한루프 문제가 발생하고스택오버플로우가 발생한 것.
        // 해결 위해서는 양방향 매핑을 맺은 필드에 대해 두개의 어노테이션을 붙여야한다. @JsonManagedReference, @JsonBackReference.
    }
}
