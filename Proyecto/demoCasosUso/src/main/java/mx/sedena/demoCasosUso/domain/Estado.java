package mx.sedena.demoCasosUso.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "rh_t_estado")
public class Estado implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idEstado;
    @Column(name = "nombre")
    private String nombreEstado;
    @Column(name = "estaactivo")
    private Long estaActivo;
}
