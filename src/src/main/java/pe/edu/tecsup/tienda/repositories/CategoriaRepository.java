package pe.edu.tecsup.tienda.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import pe.edu.tecsup.tienda.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	@Override
	List<Categoria> findAll();

	
}
