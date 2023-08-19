import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.java.ManagerFilm;

public class ManagerFilmTest {
        ManagerFilm manager = new ManagerFilm(3);
        ManagerFilm film1 = new ManagerFilm();
        ManagerFilm film2 = new ManagerFilm();
        ManagerFilm film3 = new ManagerFilm();
        ManagerFilm film4 = new ManagerFilm();
        ManagerFilm film5 = new ManagerFilm();
        ManagerFilm film6 = new ManagerFilm();
        ManagerFilm film7 = new ManagerFilm();


        @Test
        public void FindAllTest() {
            manager.addNewFilm(film1);
            manager.addNewFilm(film2);
            manager.addNewFilm(film3);

            ManagerFilm[] expected = {film1, film2, film3};
            ManagerFilm[] actual = manager.findAll();

            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void FindLastTest() {
            manager.addNewFilm(film1);
            manager.addNewFilm(film2);
            manager.addNewFilm(film3);

            ManagerFilm[] expected = {film3, film2, film1};
            ManagerFilm[] actual = manager.findLast();

            Assertions.assertArrayEquals(expected, actual);
        }
        @Test
        public void FindLastIfEightInList() {
            manager.addNewFilm(film1);
            manager.addNewFilm(film2);
            manager.addNewFilm(film3);
            manager.addNewFilm(film4);
            manager.addNewFilm(film5);
            manager.addNewFilm(film6);
            manager.addNewFilm(film7);

            ManagerFilm[] expected = {film7, film6, film5};
            ManagerFilm[] actual = manager.findLast();

            Assertions.assertArrayEquals(expected, actual);
        }
        @Test
        public void FindLastIfMoreThanLimit() {
            ManagerFilm manager = new ManagerFilm();

            manager.addNewFilm(film1);
            manager.addNewFilm(film2);
            manager.addNewFilm(film3);
            manager.addNewFilm(film4);
            manager.addNewFilm(film5);
            manager.addNewFilm(film6);
            manager.addNewFilm(film7);

            ManagerFilm[] expected = {film7, film6, film5,film4,film3};
            ManagerFilm[] actual = manager.findLast();

            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void IfLimitLargerArray() {
            manager.addNewFilm(film1);
            manager.addNewFilm(film2);

            ManagerFilm[] expected = {film2, film1};
            ManagerFilm[] actual = manager.findLast();

            Assertions.assertArrayEquals(expected, actual);
        }

}
