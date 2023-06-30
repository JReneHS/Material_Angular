package mx.sedena.demoCasosUso.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "rh_t_puesto")
public class Puesto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idPuesto;
    @Column(name = "nombre")
    private String nombrePuesto;
    @Column(name = "estaactivo")
    private Long EstaActivo;
}
