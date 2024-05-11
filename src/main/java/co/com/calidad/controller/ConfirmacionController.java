package co.com.calidad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfirmacionController {

	@GetMapping("/confir")
	public String confirmacion() {
		return "Su mensaje ha sido recibido";
	}
}
