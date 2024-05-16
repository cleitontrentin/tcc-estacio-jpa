package com.gerenciamentoDeCartao.tcc.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerenciamentoDeCartao.tcc.entities.Users;

@RestController 
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<Users> findAll(){
		Users u = new Users(1L, "Cleiton", "cleiton", "123");
		return ResponseEntity.ok().body(u);
	}

}
