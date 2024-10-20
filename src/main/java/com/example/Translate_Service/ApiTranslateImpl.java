package com.example.Translate_Service;

import org.springframework.stereotype.Component;

@Component
public class ApiTranslateImpl implements ApiTranslate {

    @Override
    public String translate(String message, String source, String target) {
        // Simulación de traducción: simplemente devuelve el mensaje original.
        // Aquí es donde deberías llamar a un servicio externo de traducción.
        return String.format("Translated from %s to %s: %s", source, target, message);
    }
}