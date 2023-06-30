package mx.sedena.demoCasosUso.dao;

import mx.sedena.demoCasosUso.domain.RecursoHumano;
import org.springframework.data.repository.CrudRepository;

public interface RecursoHumanoDAO extends CrudRepository<RecursoHumano,Long> {
}
