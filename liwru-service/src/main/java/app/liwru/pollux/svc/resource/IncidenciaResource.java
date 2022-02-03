package app.liwru.pollux.svc.resource;

import app.liwru.pollux.svc.service.IncidenciaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/incidencias")
@RestController
public class IncidenciaResource {

    private final IncidenciaService incidenciaService;

    public IncidenciaResource(IncidenciaService incidenciaService) {
        this.incidenciaService = incidenciaService;
    }

    @GetMapping
    public ResponseEntity getIncidencia() {
        return new ResponseEntity<>(incidenciaService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{idIncidencia}")
    public ResponseEntity getIncidencia(@PathVariable Integer idIncidencia) {
        return new ResponseEntity<>(incidenciaService.findAll(), HttpStatus.OK);
    }
}
