package foro.hub.api.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull
        Long idUsuario,
        String mensaje,
        String nombreCurso,
        String titulo
) {
}
