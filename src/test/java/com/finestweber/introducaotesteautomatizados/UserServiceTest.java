package com.finestweber.introducaotesteautomatizados;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserServiceTest {
    private UserService userService = new UserService();

    @Test
    public void createUser() {
        User user = new User("Gamaliel", "123456");
        userService.create(user);
        List<User> users = userService.getUsers();
        assertEquals(1, users.size(), "O número de usuários deve ser 1");
        assertEquals(user, users.get(0), "O usuário adicionado deve ser o mesmo que o criado");
    }

    @Test
    public void createUser_ThrowsException() {
        User user = new User("Gamaliel", "123456");
        userService.create(user);
        assertThrows(DuplicateUserException.class, () -> userService.create(user),
                "Deve lançar uma exceção ao criar um usuário duplicado");
    }
}
