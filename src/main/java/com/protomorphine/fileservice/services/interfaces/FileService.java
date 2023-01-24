package com.protomorphine.fileservice.services.interfaces;

import com.protomorphine.fileservice.model.dto.FileDto;

import java.util.List;

public interface FileService {

    /**
     * @param fileName Имя файла
     * @param contentType Тип контента в файле
     * @param fileContent Содержимое файла
     * @return Дто файла
     */
    FileDto uploadFile(String fileName, String contentType, byte[] fileContent);

    List<FileDto> getAll();
}
