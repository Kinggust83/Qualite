package isen.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void setName() {
        Person person = new Person();
        person.setName("John");
        assertEquals("John", person.getName(), "Le nom est 'John'");
    }

    @Test
    void setYears() {
        Person person = new Person();

        person.setYears(30);
        assertEquals(30, person.getYears(), "L'âge doit être 30");
    }

    @Test
    void testPersonConstructor() {
        Person person = new Person();
        assertEquals("unknown", person.getName(), "Le nom par défaut est 'unknown'");
        assertEquals(22, person.getYears(), "L'âge par défaut est 22");
    }
}
