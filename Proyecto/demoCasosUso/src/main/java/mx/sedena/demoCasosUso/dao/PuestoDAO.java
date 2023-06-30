package mx.sedena.demoCasosUso.dao;

import mx.sedena.demoCasosUso.domain.Estado;
import mx.sedena.demoCasosUso.domain.Puesto;
import org.springframework.data.repository.CrudRepository;

public interface PuestoDAO extends CrudRepository<Puesto,Long> {
}
