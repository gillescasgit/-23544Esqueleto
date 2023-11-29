package ar.com.codoacodo.repository;

import ar.com.codoacodo.entity.Orador;

public class MainOradorRepository {

	 public static void main(String[] args) {
		
		 OradorRepository repository = new MySqlOradorRepository();
		 
		 Orador nombre =repository.getById(3L);
		 
		 nombre.setApellido("apellidoA");
		 nombre.setNombre("nombreA");
		 nombre.setTema("C++");
		 
		 repository.update(nombre);
		 
		 System.out.println(repository.findAll());
		 
	}
}
