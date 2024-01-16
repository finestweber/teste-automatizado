package com.finestweber.introducaotesteautomatizados;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {

    // Lista para armazenar os usuários
    private List<User> users = new ArrayList<>();

    // Método para criar um novo usuário
    public List<User> create(User user) {

        // Verifica se o usuário já existe na lista
        if (users.contains(user)) {
            // Lança uma exceção personalizada se o usuário já existir
            throw new DuplicateUserException("Usuário já existe na lista: " + user.username());
        }

        // Adiciona o usuário à lista se não existir
        users.add(user);
        // Retorna a lista atualizada de usuários
        return users;
    }

    // Método para obter a lista de usuários
    public List<User> getUsers() {
        // Retorna a lista de usuários
        return users;
    }
}
