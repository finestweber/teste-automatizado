package com.finestweber.introducaotesteautomatizados;

// Define uma exceção personalizada que estende RuntimeException
public class DuplicateUserException extends RuntimeException {

    // Construtor que recebe uma mensagem explicativa
    public DuplicateUserException(String message) {
        // Chama o construtor da classe pai (RuntimeException) com a mensagem
        super(message);
    }
}


