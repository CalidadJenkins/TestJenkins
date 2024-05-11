package co.com.calidad.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Confirmacion {

    @RequestMapping(value = "/confir", method = RequestMethod.GET)
    public String confirmacion() {
        return "Su mensaje ha sido recibido";
    }
}
