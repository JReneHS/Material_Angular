package mx.sedena.demoCasosUso.dao;

import mx.sedena.demoCasosUso.domain.Departamento;
import mx.sedena.demoCasosUso.domain.Estado;
import org.springframework.data.repository.CrudRepository;

public interface EstadoDAO  extends CrudRepository<Estado,Long> {
}
