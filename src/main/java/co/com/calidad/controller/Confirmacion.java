package co.com.calidad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Confirmacion {

	@GetMapping("/confir")
    public String confirmacion() {
        return "Su mensaje ha sido recibido";
    }
	
}
