package hexlet.code;

import hexlet.code.schemas.MapSchema;
import hexlet.code.schemas.NumberSchema;
import hexlet.code.schemas.StringSchema;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ValidatorTest {

    private Validator validator;

    @BeforeEach
    final void setUp() {
        validator = new Validator();
    }

    @Test
    void testStringSchema() {
        StringSchema schema = validator.string();

        assertTrue(schema.isValid(null));
        assertTrue(schema.isValid(""));
        assertTrue(schema.isValid("Hexlet"));
        assertFalse(schema.isValid(5));

        schema.required();

        assertFalse(schema.isValid(null));
        assertFalse(schema.isValid(""));
        assertTrue(schema.isValid("Hexlet"));

        schema.minLength(5);

        assertTrue(schema.isValid("Hexlet"));
        assertFalse(schema.isValid("let"));

        schema.contains("let");
        assertTrue(schema.isValid("Hexlet"));

        schema.contains("exl");
        assertTrue(schema.isValid("Hexlet"));

        schema.contains("hello");
        assertFalse(schema.isValid("Hexlet"));
    }

    @Test
    void testNumberSchema() {
        NumberSchema schema = validator.number();

        assertTrue(schema.isValid(null));
        assertTrue(schema.isValid(50));
        assertTrue(schema.isValid(-50));
        assertTrue(schema.isValid(0));
        assertFalse(schema.isValid("Hexlet"));

        schema.positive();

        assertTrue(schema.isValid(null));
        assertTrue(schema.isValid(50));
        assertFalse(schema.isValid(-50));
        assertFalse(schema.isValid(0));

        schema.required();

        assertFalse(schema.isValid(null));
        assertTrue(schema.isValid(50));
        assertFalse(schema.isValid(-50));
        assertFalse(schema.isValid(0));

        schema.range(40, 100);

        assertTrue(schema.isValid(50));
        assertTrue(schema.isValid(60));
        assertTrue(schema.isValid(100));
        assertFalse(schema.isValid(30));
        assertFalse(schema.isValid(120));
    }

    @Test
    void testMapSchema() {
        MapSchema schema = validator.map();
        Map<String, String> testMap = new HashMap<>();

        assertTrue(schema.isValid(null));
        assertTrue(schema.isValid(testMap));

        schema.required();

        assertFalse(schema.isValid(null));
        assertTrue(schema.isValid(testMap));

        testMap.put("key1", "value1");
        assertTrue(schema.isValid(testMap));

        schema.sizeof(2);

        assertFalse(schema.isValid(testMap));

        testMap.put("key2", "value2");
        assertTrue(schema.isValid(testMap));
    }
}
