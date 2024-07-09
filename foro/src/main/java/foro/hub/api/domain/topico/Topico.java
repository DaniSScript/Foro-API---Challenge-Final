package foro.hub.api.domain.topico;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "foro")
@Entity (name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (of = "idUsuario")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String mensaje;
    private String nombreCurso;
    private String titulo;

    public Topico(DatosRegistroTopico datosRegistroTopico){
        this.mensaje=datosRegistroTopico.mensaje();
        this.nombreCurso=datosRegistroTopico.nombreCurso();
        this.titulo=datosRegistroTopico.titulo();
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void actualizarForo(DatosActualizarTopico datosActualizarTopico){
        if(datosActualizarTopico.mensaje()!=null){
            this.mensaje=datosActualizarTopico.mensaje();
        }
        if(datosActualizarTopico.nombreCurso()!=null){
            this.nombreCurso=datosActualizarTopico.nombreCurso();
        }
        if(datosActualizarTopico.titulo()!=null){
            this.titulo=datosActualizarTopico.titulo();
        }
    }



}
