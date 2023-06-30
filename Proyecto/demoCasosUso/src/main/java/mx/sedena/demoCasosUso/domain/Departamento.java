package mx.sedena.demoCasosUso.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "rh_t_departamento")
public class Departamento implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idDepartamento;
    @Column(name = "nombre")
    private String nombreDepartamento;
    @Column(name = "estaactivo")
    private Long estaActivo;
}
