package foro.hub.api.domain.topico;

public record DatosRespuestaForo(
        Long id,
        String mensaje,
        String nombreCurso,
        String titulo
) {
}
