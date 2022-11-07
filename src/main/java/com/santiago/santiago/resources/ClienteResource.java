package com.santiago.santiago.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santiago.santiago.entities.Cliente;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
	
	@GetMapping
	public ResponseEntity<Cliente> findall(){
		Cliente c = new Cliente(1L, "Lucio", "Av. Getulio Vargas 1448, ap 03", "MG 5796575 SSP-MG", "881174486-53", "(34)991340673");
		return ResponseEntity.ok().body(c);
	}

}
