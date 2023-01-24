package com.protomorphine.fileservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class FileDto {

    /**
     * Идентификатор файла
     */
    private UUID id;

    /**
     * Имя файла
    */
    private String fileName;

    /**
     * Тип файла
     */
    private String contentType;
}
