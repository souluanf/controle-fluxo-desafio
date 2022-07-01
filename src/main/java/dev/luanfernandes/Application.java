package dev.luanfernandes;

import dev.luanfernandes.service.ContadorService;
import dev.luanfernandes.service.ContadorServiceImpl;
import dev.luanfernandes.service.exceptions.ParametrosInvalidosException;

public class Application {
    public static void main(String[] args) throws ParametrosInvalidosException {
        ContadorService service = new ContadorServiceImpl();
        service.contador(30,10);
    }
}