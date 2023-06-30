package mx.sedena.demoCasosUso.dao;

import mx.sedena.demoCasosUso.domain.Departamento;
import org.springframework.data.repository.CrudRepository;

public interface DepartamentoDAO extends CrudRepository<Departamento,Long> {
}
