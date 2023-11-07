package io.swagger.mapper;


import io.swagger.entity.DocumentEntity;
import io.swagger.model.Document;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.openapitools.jackson.nullable.JsonNullable;

@Mapper
public interface DocumentMapper <Entity,Dto>{

    Entity dtoToEntity(Dto dto);
    Dto entityToDto(Entity entity);

    default <T> T map(JsonNullable<T> value){
        if(value == null || !value.isPresent()) return null;
        return value.get();
    }

    default <T> JsonNullable<T> map(T value){
        return JsonNullable.of(value);
    }
}
