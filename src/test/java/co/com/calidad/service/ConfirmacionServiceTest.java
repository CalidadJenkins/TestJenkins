package co.com.calidad.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConfirmacionServiceTest {

	@Test
    public void testConfirmacionService() {
        ConfirmacionService confirmacionService = new ConfirmacionService();
        String confirmacion = confirmacionService.crearConfirmacion();
        assertEquals("Confirmacion creada", confirmacion);
    }
}
