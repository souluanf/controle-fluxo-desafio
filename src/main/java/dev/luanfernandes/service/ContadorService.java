package dev.luanfernandes.service;

import dev.luanfernandes.service.exceptions.ParametrosInvalidosException;

public interface ContadorService {
    void contador(int param1, int param2) throws ParametrosInvalidosException;
}
