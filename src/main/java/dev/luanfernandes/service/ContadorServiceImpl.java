package dev.luanfernandes.service;

import dev.luanfernandes.service.exceptions.ParametrosInvalidosException;

public class ContadorServiceImpl implements ContadorService {

    public void contador(int param1, int param2) throws ParametrosInvalidosException {
        try {
            contar(param1, param2);
        } catch (ParametrosInvalidosException exception) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    public void contar(int param1, int param2) throws ParametrosInvalidosException {
        if (param2 < param1) {
            throw new ParametrosInvalidosException();
        }
        int contagem = param2 - param1;
        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}
