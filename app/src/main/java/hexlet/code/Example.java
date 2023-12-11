package hexlet.code;

//import hexlet.code.schemas.BaseSchema;
//import hexlet.code.schemas.MapSchema;
//import hexlet.code.schemas.NumberSchema;
//import hexlet.code.schemas.StringSchema;
//
//import java.util.HashMap;
//import java.util.Map;

public class Example {
//    public static void main(String[] args) {
//        Validator v = new Validator();
//        StringSchema schema = v.string();
//
//        // Пока не вызван метод required(), null и пустая строка считаются валидным:
//        System.out.println("schema.isValid(\"\")=" + schema.isValid("")); // true
//        System.out.println("schema.isValid(null)=" + schema.isValid(null)); // true
//
//        schema.required();
//
//        System.out.println("schema.isValid(null)=" + schema.isValid(null)); // false
//        System.out.println("schema.isValid(\"\")=" + schema.isValid("")); // false
//        System.out.println("schema.isValid(5)=" + schema.isValid(5)); // false
//        System.out.println("schema.isValid(\"what does the fox say\")="
//                           + schema.isValid("what does the fox say")); // true
//        System.out.println("schema.isValid(\"hexlet\")=" + schema.isValid("hexlet")); // true
//
//        System.out.println("schema.contains(\"wh\").isValid(\"what does the fox say\")="
//                           + schema.contains("wh").isValid("what does the fox say")); // true
//        System.out.println("schema.contains(\"what\").isValid(\"what does the fox say\")="
//                           + schema.contains("what").isValid("what does the fox say")); // true
//        System.out.println("schema.contains(\"whatthe\").isValid(\"what does the fox say\")="
//                           + schema.contains("whatthe").isValid("what does the fox say")); // false
//
//        System.out.println("schema.isValid(\"what does the fox say\")="
//                           + schema.isValid("what does the fox say")); // false
//        // Здесь уже false, так как добавлена еще одна проверка contains("whatthe")
//
//
//        Validator validator = new Validator();
//        NumberSchema schema1 = validator.number();
//
//        // Пока не вызван метод required(), null считается валидным
//        System.out.println("schema1.isValid(null)=" + schema1.isValid(null)); // true
//        System.out.println("schema1.positive().isValid(null)=" + schema1.positive().isValid(null)); // true
//
//        schema1.required();
//
//        System.out.println("schema1.isValid(null)=" + schema1.isValid(null)); // false
//        System.out.println("schema1.isValid(\"5\")=" + schema1.isValid("5")); // false
//        System.out.println("schema1.isValid(10)=" + schema1.isValid(10)); // true
//
//        // Потому что ранее мы вызвали метод positive()
//        System.out.println("schema1.isValid(-10)=" + schema1.isValid(-10)); // false
//        //  Ноль — не положительное число
//        System.out.println("schema1.isValid(0)=" + schema1.isValid(0)); // false
//
//        schema1.range(5, 10);
//
//        System.out.println("schema1.isValid(5)=" + schema1.isValid(5)); // true
//        System.out.println("schema1.isValid(10)=" + schema1.isValid(10)); // true
//        System.out.println("schema1.isValid(4)=" + schema1.isValid(4)); // false
//        System.out.println("schema1.isValid(11)=" + schema1.isValid(11)); // false
//
//
//        Validator validator2 = new Validator();
//        MapSchema schema2 = validator2.map();
//
//        System.out.println("schema2.isValid(null)=" + schema2.isValid(null)); // true
//
//        schema2.required();
//
//        System.out.println("schema2.isValid(null)=" + schema2.isValid(null)); // false
//        System.out.println("schema2.isValid(new HashMap<>())=" + schema2.isValid(new HashMap<>())); // true
//        Map<String, String> data = new HashMap<>();
//        data.put("key1", "value1");
//        System.out.println("schema2.isValid(data)=" + schema2.isValid(data)); // true
//
//        schema2.sizeof(2);
//
//        System.out.println("schema2.isValid(data)=" + schema2.isValid(data));  // false
//        data.put("key2", "value2");
//        System.out.println("schema2.isValid(data)=" + schema2.isValid(data)); // true
//
//        Validator validator3 = new Validator();
//        MapSchema schema3 = validator3.map();
//
//        // shape позволяет описывать валидацию для значений каждого ключа объекта Map
//        // Создаем набор схем для проверки каждого ключа проверяемого объекта
//        // Для значения каждого ключа - своя схема
//        Map<String, BaseSchema> schemas = new HashMap<>();
//        // Определяем схемы валидации для значений свойств "name" и "age"
//        // Имя должно быть строкой, обязательно для заполнения
//        schemas.put("name", v.string().required());
//        // Возраст должен быть положительным числом
//        schemas.put("age", v.number().positive());
//        // Настраиваем схему `MapSchema`
//        // Передаем созданный набор схем в метод shape()
//        schema3.shape(schemas);
//        // Проверяем объекты
//        Map<String, Object> human1 = new HashMap<>();
//        human1.put("name", "Kolya");
//        human1.put("age", 100);
//        System.out.println("schema3.isValid(human1)=" + schema3.isValid(human1)); // true
//
//        Map<String, Object> human2 = new HashMap<>();
//        human2.put("name", "Maya");
//        human2.put("age", null);
//        System.out.println("schema3.isValid(human2)=" + schema3.isValid(human2)); // true
//
//        Map<String, Object> human3 = new HashMap<>();
//        human3.put("name", "");
//        human3.put("age", null);
//        System.out.println("schema3.isValid(human3)=" + schema3.isValid(human3)); // false
//
//        Map<String, Object> human4 = new HashMap<>();
//        human4.put("name", "Valya");
//        human4.put("age", -5);
//        System.out.println("schema3.isValid(human4)=" + schema3.isValid(human4)); // false
//    }
}
