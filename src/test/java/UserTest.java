import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private final User user = new User("Login", "Password", "mail@.com");

    @Test
    void Login_Example_Success() {
        assertEquals("Login", user.getLogin());


    }
    @Test
    void Login_Example_Null() {
        assertNull(null, user.getLogin());
    }
    @Test
    void Password_Example_Success() {
        assertEquals("Password", user.getPassword());
    }

    @Test
    void Email_Example_Success() {
        assertEquals("mail@.com", user.getEmail());
    }

    @Test
    void Login_Example_Negative() {
        user.setLogin("Login");

        assertThrows(IllegalArgumentException.class, () -> user.setLogin("rr"));
        System.out.println("Логин должен быть не менее 3 символов!");

    }

    @Test
    void Password_Example_Negative() {
        user.setPassword("12345678");

        assertThrows(IllegalArgumentException.class, () -> user.setPassword("1234567"));
        System.out.println("Пароль должен содержать не менее восьми символов");

    }

    @Test
    void Email_Example_Negative() {
        user.setEmail("mail@.com");

        assertThrows(IllegalArgumentException.class, () -> user.setEmail("mail.com"));
        System.out.println("Email должен содержать @");
    }

    @Test
    void isValidPassword_try_true() {
        assertTrue(user.isValidPassword("Password"));

    }
    @Test
    void isValidPassword_try_false() {

        assertFalse(user.isValidPassword("False"));
        System.out.println();
    }
}


//Требования:
//
//Напишите тестовый класс UserTest, в котором будут тесты для каждого метода класса User.
//Используйте аннотацию @Test для каждого тестового метода.
//Используйте методы утверждений (assertEquals, assertNotEquals, assertTrue, assertFalse, assertNull, assertNotNull) для проверки правильности работы каждого метода.
//Напишите тест для проверки исключения IllegalArgumentException в методах setLogin, setPassword и setEmail.
//Напишите тест для проверки методаisValidPassword.