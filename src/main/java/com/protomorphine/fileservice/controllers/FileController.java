package com.protomorphine.fileservice.controllers;

import com.protomorphine.fileservice.model.dto.FileDto;
import com.protomorphine.fileservice.services.interfaces.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/file")
@RequiredArgsConstructor
public class FileController {

    private final FileService fileService;

    @PostMapping(name = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public FileDto uploadFile(@RequestPart("file") MultipartFile file) throws IOException {
        return fileService.uploadFile(file.getOriginalFilename(),
                file.getContentType(),
                file.getBytes());
    }

    @GetMapping("/all")
    public List<FileDto> getAllFiles(){
        return fileService.getAll();
    }
}
