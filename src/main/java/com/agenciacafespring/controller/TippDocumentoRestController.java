package com.agenciacafespring.controller;

import com.agenciacafespring.entitys.TipoDocumento;
import com.agenciacafespring.services.service.TipoDocumentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tipo_documentos/v1")
@RequiredArgsConstructor
public class TippDocumentoRestController {

    private final TipoDocumentoService tipoDocumentoService;

    @GetMapping("/List")
    public ResponseEntity<List<TipoDocumento>> listTipoDocumentos() {
        List<TipoDocumento> TipoDocumentoList=tipoDocumentoService.getListTipoDocumento();
        return new ResponseEntity<>(TipoDocumentoList, HttpStatus.ACCEPTED);
    }
}
