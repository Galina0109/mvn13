import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        Epic epic = new Epic(55, ("Молоко" "Яйца", "Хлеб");

        boolean actual = epic.matches("Молоко");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEpicNotMatches() {
        Epic epic = new Epic(55, ("Молоко", "Яйца", "Хлеб");

        boolean actual = Epic.;
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMeetingMatches() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = Meeting.matches("Выкатка");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMeetingNotMatches() {
        Meeting meeting = new Meeting(555,"Выкатка 3й версии приложения","Приложение НетоБанка",
"Во вторник после обеда"
        );

        boolean actual =  ;
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
}
