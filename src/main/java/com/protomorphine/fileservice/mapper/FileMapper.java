package com.protomorphine.fileservice.mapper;

import com.protomorphine.fileservice.model.dto.FileDto;
import com.protomorphine.fileservice.model.entity.File;
import com.protomorphine.fileservice.services.interfaces.FileService;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", uses = {FileService.class})
public interface FileMapper {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(source = "id", target = "id")
    FileDto toFileDto(File file);
}
