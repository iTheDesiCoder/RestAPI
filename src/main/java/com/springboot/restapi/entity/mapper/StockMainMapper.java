package com.springboot.restapi.entity.mapper;

import com.springboot.restapi.entity.StockMainDto;
import com.springboot.restapi.entity.JPA.StockMain;
import org.mapstruct.*;
import org.springframework.stereotype.Component;

@Component
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface StockMainMapper {
    StockMain toEntity(StockMainDto stockMainDto);

    StockMainDto toDto(StockMain stockMain);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    StockMain partialUpdate(StockMainDto stockMainDto, @MappingTarget StockMain stockMain);
}