package com.agenciacafespring.services;

import com.agenciacafespring.entitys.TipoDocumento;
import com.agenciacafespring.entitys.repository.TipoDocumentoRepository;
import com.agenciacafespring.services.service.TipoDocumentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipoDocumentoServiceImplement implements TipoDocumentoService {
    private final TipoDocumentoRepository tipoDocumentoRepository;
    @Override
    public List<TipoDocumento> getListTipoDocumento() {
        return tipoDocumentoRepository.ListTipoDocumentos();
    }
}
