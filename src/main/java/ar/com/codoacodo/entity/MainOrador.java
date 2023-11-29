package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class MainOrador {

	public static void main(String[] args) {

		Orador nuevoOrador = new Orador("nombre", "apellid", "casilla@email.com", "JAVA", LocalDate.now()); 		
		System.out.println("Datos nuevo Orador en MainOrador");
		System.out.println(nuevoOrador);
	}

}
