package com.protomorphine.fileservice.services.interfaces;

import com.protomorphine.fileservice.model.dto.FileDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface FileService {

    /**
     * Загружает новый файл
     * @param fileName Имя файла
     * @param contentType Тип контента в файле
     * @param fileContent Содержимое файла
     * @return Дто файла
     */
    FileDto uploadFile(String fileName, String contentType, byte[] fileContent);

    /**
     * Получает все файлы в БД
     * @return Спмсок файлов
     */
    List<FileDto> getAll();

    /**
     * @param pageable Параметры пагинации
     * @return Пагинированный список файлов
     */
    Page<FileDto> getPaged(Pageable pageable);

    /**
     * @param id Идентификатор файла
     * @return Содержимое файла
     */
    byte[] getContentById(UUID id);
}
