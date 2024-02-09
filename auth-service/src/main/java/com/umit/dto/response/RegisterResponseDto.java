package com.umit.dto.response;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class RegisterResponseDto {

    @Size(min = 3,max = 64)
    @NotNull
    String userName;

}
