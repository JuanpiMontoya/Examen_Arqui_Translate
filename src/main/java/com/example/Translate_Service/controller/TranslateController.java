package com.example.Translate_Service.controller;

import com.example.Translate_Service.TranslateRequestDto;
import com.example.Translate_Service.TranslateService;
import com.example.Translate_Service.api.TranslateApi;
import com.example.Translate_Service.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslateController implements TranslateApi {

    private final TranslateService translateService;

    public TranslateController(TranslateService translateService) {
        this.translateService = translateService;
    }

    @Override
    public ResponseEntity<String> translate(TranslateRequestDto translateRequestDto) {
        try {
            String translatedMessage = translateService.translate(translateRequestDto);
            return ResponseEntity.ok(translatedMessage);
        } catch (Exception e) {
            // Manejo de errores: puedes personalizar el mensaje de error según sea necesario
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ErrorResponse("Error al traducir el mensaje").toString());
        }
    }
}