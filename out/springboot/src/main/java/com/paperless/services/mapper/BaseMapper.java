package com.paperless.services.mapper;

import org.openapitools.jackson.nullable.JsonNullable;

import java.time.OffsetDateTime;

public interface BaseMapper<EN, DTO> {
    DTO entityToDto(EN entity);

    EN dtoToEntity(DTO dto);

    default <T> T map(JsonNullable<T> value) {

        if(value == null || !value.isPresent()) {
            return null;
        }

        return value.get();
    }


    default <T> JsonNullable<T> map(T value) {
        return JsonNullable.of(value);
    }

    default OffsetDateTime mapOffsetDateTime(String value){
        return OffsetDateTime.parse(value);
    }

    default String mapOffsetDateTime(OffsetDateTime value){
        return value.toString();
    }

}
