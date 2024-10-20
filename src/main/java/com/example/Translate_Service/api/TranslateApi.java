package com.example.Translate_Service.api;

import com.example.Translate_Service.TranslateRequestDto;
import com.example.Translate_Service.model.ErrorResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Traducción", description = "API para realizar traducciones de texto")
@RestController
@RequestMapping("/api/translate")
public interface TranslateApi {

    @Operation(summary = "Traducir un mensaje",
            description = "Traduce un mensaje de un idioma a otro.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Traducción realizada exitosamente"),
            @ApiResponse(responseCode = "400", description = "Datos de traducción inválidos",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
    })
    @PostMapping
    ResponseEntity<String> translate(@RequestBody TranslateRequestDto translateRequestDto);
}