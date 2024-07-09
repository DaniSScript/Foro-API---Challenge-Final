package foro.hub.api.controller;

import foro.hub.api.domain.topico.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/foro")
public class ForoController {
    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public ResponseEntity<DatosRespuestaForo> registrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico, UriComponentsBuilder uriComponentsBuilder) {
        Topico topico = topicoRepository.save(new Topico(datosRegistroTopico));
        DatosRespuestaForo datosRespuestaForo = new DatosRespuestaForo(topico.getIdUsuario(), topico.getMensaje(), topico.getNombreCurso(), topico.getTitulo());
        URI url = uriComponentsBuilder.path("/topico/{id}").buildAndExpand(topico.getIdUsuario()).toUri();
        return ResponseEntity.created(url).body(datosRespuestaForo);
    }

    @GetMapping
    public ResponseEntity<Page<DatosListadoTopico>> listadoTopico(@PageableDefault Pageable paginacion) {
        return ResponseEntity.ok(topicoRepository.findAll(paginacion).map(DatosListadoTopico::new));
    }

    @PutMapping
    @Transactional
    public ResponseEntity actualizarForo(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico) {
        Topico topico = topicoRepository.getReferenceById(datosActualizarTopico.idUsuario());
        topico.actualizarForo(datosActualizarTopico);
        return ResponseEntity.ok(new DatosRespuestaForo(topico.getIdUsuario(), topico.getMensaje(), topico.getNombreCurso(), topico.getTitulo()));
    }

    @DeleteMapping("/{idUsuario}")
    @Transactional
    public ResponseEntity eliminarForo(@PathVariable Long idUsuario) {
        Topico topico = topicoRepository.getReferenceById(idUsuario);
        topicoRepository.delete(topico);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{idUsuario}")
    public ResponseEntity<DatosRespuestaForo> retornaDatosForo(@PathVariable Long idUsuario) {
        Topico topico = topicoRepository.getReferenceById(idUsuario);
        var datosForo = new DatosRespuestaForo(topico.getIdUsuario(), topico.getMensaje(), topico.getNombreCurso(), topico.getTitulo());
        return ResponseEntity.ok(datosForo);
    }
}
