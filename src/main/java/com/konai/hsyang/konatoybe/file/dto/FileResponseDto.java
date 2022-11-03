package com.konai.hsyang.konatoybe.file.dto;

import com.konai.hsyang.konatoybe.file.domain.File;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class FileResponseDto {

    private Long fileID;
    private Long postID;
    private String orgFileName;
    private String storePath;
    private int fileSize;


    public FileResponseDto(File entity) {
        this.fileID = entity.getFileID();
        this.postID = entity.getPosts().getPostsID();
        this.storePath = entity.getStorepath();
        this.orgFileName = entity.getOrgfilename();
        this.fileSize = Math.round(entity.getFilesize()/1024);
    }
}
