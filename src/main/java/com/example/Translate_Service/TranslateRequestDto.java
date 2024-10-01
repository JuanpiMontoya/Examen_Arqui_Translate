package com.example.Translate_Service;

public record TranslateRequestDto (
        String message,
        Language source,
        Language target
){
}
