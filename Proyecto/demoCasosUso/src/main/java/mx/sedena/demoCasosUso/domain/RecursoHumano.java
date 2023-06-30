package mx.sedena.demoCasosUso.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "rh_t_recursohumano")
public class RecursoHumano implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idRH;
    @Column(name = "nombre")
    private String nombreRH;
    @Column(name = "primerapellido")
    private String primerApellido;
    @Column(name = "segundoapellido")
    private String segundoApellido;
    @Column(name = "curp")
    private String curp;
    @ManyToOne
    @JoinColumn(name = "rh_t_puesto_id")
    private Puesto rh_t_puesto_id;
    @ManyToOne
    @JoinColumn(name = "rh_t_departamento_id")
    private Departamento rh_t_departamento_id;
    @ManyToOne
    @JoinColumn(name = "rh_t_estado_id")
    private Estado rh_t_estado_id;
}
