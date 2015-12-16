import static org.junit.Assert.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class RegExpTutor extends Tutor {

    class Email {
        String name;
        String domainName;
        String domainZone;
    }

    public Email getEmail(String emailString) {
        return null;
    }

    /**
     * Returns a list of lines by text representation of the lines.
     * Takes a string
     * "List of animals: cow, goose, cat, dog, elephant, rabbit,
     * snake, chicken, horse, human."
     * And returns an array of animals
     */
    public String[] getAnimalsArray(String animalsString) {
        return null;
    }

    @Test
    public void testGetEmail() {
        Email email = getEmail("ivanov@mail.ru");
        assertEquals("ivanov", email.name);
        assertEquals("mail", email.domainName);
        assertEquals("ru", email.domainZone);

    }

    @Test
    public void testGetAnimalsArray() {
        String [] animals =
                {"Cow", "Goose", "Cat", "Dog", "Elephant",
                        "Rabbit", "Snake", "Chicken", "Horse", "Human"};
        String animalsString =
                "List of animals: Cow, Goose, Cat, Dog, Elephant," +
                        "Rabbit, Snake, Chicken, Horse, Human.";
        assertArrayEquals(animals, getAnimalsArray(animalsString));
    }

}
