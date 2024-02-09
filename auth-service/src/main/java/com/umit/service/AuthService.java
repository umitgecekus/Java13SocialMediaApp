package com.umit.service;

import com.umit.dto.request.RegisterRequestDto;
import com.umit.dto.response.RegisterResponseDto;
import com.umit.entity.Auth;
import com.umit.mapper.AuthMapper;
import com.umit.repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final AuthRepository authRepository;
    private final AuthMapper authMapper;

    public RegisterResponseDto register(RegisterRequestDto dto) {
        Auth auth = authMapper.toAuth(dto);
        auth.setCreateDate(System.currentTimeMillis());
        auth.setUpdateDate(System.currentTimeMillis());
        authRepository.save(auth);
        return authMapper.toRegisterResponseDto(auth);
    }

}
