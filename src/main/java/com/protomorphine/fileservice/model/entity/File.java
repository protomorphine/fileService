package com.protomorphine.fileservice.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "files")
public class File {

    /**
     * Идентификатор файла
     */
    @Id
    private UUID id;

    /**
     * Содержимое файла
     */
    @Column(name = "content")
    private byte[] content;

    /**
     * Имя файла
     */
    @Column(name = "file_name")
    private String fileName;

    /**
     * Тип файла
     */
    @Column(name = "content_type")
    private String contentType;

    /**
     * Дата загрузки файла
     */
    @Column(name = "uploaded_at")
    private LocalDateTime uploadedAt;
}
