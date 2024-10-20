package com.example.Translate_Service;

import org.springframework.stereotype.Service;

@Service
public class TranslateService {

    private final ApiTranslate apiTranslate;

    public TranslateService(ApiTranslate apiTranslate) {
        this.apiTranslate = apiTranslate;
    }

    public String translate(TranslateRequestDto translateRequestDto) {
        return apiTranslate.translate(
                translateRequestDto.message(),
                translateRequestDto.source().toString(),
                translateRequestDto.target().toString()
        );
    }
}