package mx.sedena.demoCasosUso.web;

import lombok.extern.slf4j.Slf4j;
import mx.sedena.demoCasosUso.dao.RecursoHumanoDAO;
import mx.sedena.demoCasosUso.domain.RecursoHumano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/*
 Default REST: JSON

 CRUD ->> REST
 Create / Update ->> POST
 Read / Receive ->> GET
 Update ->> PUT
 Delete ->> DELETE

 // @RequestMapping() // Only for GET Method

*/
@Slf4j
@RestController
public class ControladorInicio {
    @Autowired
    private RecursoHumanoDAO recursoHumanoDAO;

    @RequestMapping(value = "/RH")
    public List<RecursoHumano> getAllRH(){
        List<RecursoHumano> recursosHumanosList = new ArrayList<>();
        recursoHumanoDAO.findAll().forEach(recursosHumanosList::add);
        log.info("Ejecutando el Controlador Spring MVC");
        return recursosHumanosList;
    }

    @RequestMapping(value = "/RH/{id}")
    public RecursoHumano getRH(@PathVariable Long id){
        try {
            return recursoHumanoDAO.findById(id).get();
        } catch (NoSuchElementException e){
            log.error("Error al Obtener el valor");
            return new RecursoHumano();
        }
    }

    @RequestMapping(method = RequestMethod.POST, value = "/RH")
    public void addRH(@RequestBody RecursoHumano recursoHumano){
        recursoHumanoDAO.save(recursoHumano);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/RH/{id}")
    public void updateRH(@RequestBody RecursoHumano recursoHumano, @PathVariable Long id){
        recursoHumanoDAO.deleteById(id);
        recursoHumanoDAO.save(recursoHumano);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/RH/{id}")
    public void updateRH(@PathVariable Long id){
        recursoHumanoDAO.deleteById(id);
    }
}
