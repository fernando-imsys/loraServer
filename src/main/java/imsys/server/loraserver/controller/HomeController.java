package imsys.server.loraserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import imsys.server.loraserver.entity.Lectura;

@RestController
public class HomeController {
	@GetMapping("/test")
	public String inicio() {
		return "Hello World";
	}
	
	@PostMapping(path = "/uplink", 
				 consumes = "application/json", 
				 produces = "application/json")
	public String postUplink(@RequestBody Lectura lectura) {
		return "OK";
	}
}
