package com.example.demo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path="/api/ec3")
@RepositoryRestResource(collectionResourceRel = "instrumentos",path="instrumentos")
public interface InstrumentoRepository extends PagingAndSortingRepository<Instrumento,Integer>,CrudRepository<Instrumento,Integer>{

    List<Instrumento> findByNombre(@Param("nombre") String nombre);
}