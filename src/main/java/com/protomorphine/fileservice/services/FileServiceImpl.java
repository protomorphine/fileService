package com.protomorphine.fileservice.services;

import com.protomorphine.fileservice.mapper.FileMapper;
import com.protomorphine.fileservice.model.dto.FileDto;
import com.protomorphine.fileservice.model.entity.File;
import com.protomorphine.fileservice.repository.FileRepository;
import com.protomorphine.fileservice.services.interfaces.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {

    private final FileRepository fileRepository;

    private final FileMapper fileMapper;

    @Override
    public FileDto uploadFile(String fileName, String contentType, byte[] fileContent) {
        UUID fileId = UUID.randomUUID();
        File file = new File(fileId, fileContent, fileName, contentType, LocalDateTime.now());
        fileRepository.save(file);
        return fileMapper.toFileDto(file);
    }

    /**
     * @return
     */
    @Override
    public List<FileDto> getAll() {
       return fileRepository
               .findAll()
               .stream()
               .map(fileMapper::toFileDto)
               .collect(Collectors.toList());
    }
}
