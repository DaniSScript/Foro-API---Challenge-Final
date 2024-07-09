package foro.hub.api.domain.topico;

public record DatosListadoTopico(
        Long idUsuario,
        String mensaje,
        String nombreCurso,
        String titulo
) {
    public DatosListadoTopico(Topico topico){
        this(topico.getIdUsuario(),topico.getMensaje(),topico.getNombreCurso(),topico.getTitulo());
    }
}
