package com.umit.mapper;

import com.umit.dto.request.RegisterRequestDto;
import com.umit.dto.response.RegisterResponseDto;
import com.umit.entity.Auth;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthMapper {
    AuthMapper INSTANCE = Mappers.getMapper(AuthMapper.class);

    Auth toAuth(final RegisterRequestDto dto);

    RegisterResponseDto toRegisterResponseDto(Auth auth);

}
