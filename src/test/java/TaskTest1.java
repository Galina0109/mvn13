import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;


class TaskTest {

    @Test
    public void testSimpleTaskMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSimpleTaskNotMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Вызвать");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testEpicMatches() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = Epic.matches("Молоко");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
}

