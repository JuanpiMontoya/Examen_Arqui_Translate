package com.example.Translate_Service;

import org.springframework.stereotype.Service;

@Service
public class TranslateService {

    ApiTranslate apiTranslate;

    TranslateService(ApiTranslate apiTranslate){
        this.apiTranslate=apiTranslate;
    }

    public String translate(TranslateRequestDto translateRequestDto){
        return apiTranslate.translate(translateRequestDto.message(),translateRequestDto.source().toString(),translateRequestDto.target().toString());//se esta usando el de google, ademas vemos una forma de obtener valores de enum usando toString
    }
}