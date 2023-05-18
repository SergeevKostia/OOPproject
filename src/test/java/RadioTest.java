
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {

    @Test
    public void shouldSetRadioWave() {
        Radio stat = new Radio();
        stat.setCurrentRadioWave(6);
        int expected = 6;
        int actual = stat.getCurrentRadioWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWave() {
        Radio stat = new Radio();
        stat.setCurrentRadioWave(10);
        int expected = 0;
        int actual = stat.getCurrentRadioWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverRadioWave() {
        Radio stat = new Radio();
        stat.setCurrentRadioWave(4);
        stat.nextRadioWave();
        int expected = 5;
        int actual = stat.getCurrentRadioWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverMaxRadioWave() {
        Radio stat = new Radio();
        stat.setCurrentRadioWave(9);
        stat.nextRadioWave();
        int expected = 0;
        int actual = stat.getCurrentRadioWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNextRadioWave() {
        Radio stat = new Radio();
        stat.setCurrentRadioWave(9);
        stat.nextRadioWave();
        int expected = 0;
        int actual = stat.getCurrentRadioWave();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void switchBackRadioWave() {
        Radio stat = new Radio();
        stat.setCurrentRadioWave(0);
        stat.stepBackRadioWave();
        int expected = 9;
        int actual = stat.getCurrentRadioWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchBackLessThanMinRadioWave() {
        Radio stat = new Radio();
        stat.setCurrentRadioWave(-1);
        int expected = stat.currentRadioWave;
        int actual = stat.getCurrentRadioWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchBackLess9RadioWave() {
        Radio stat = new Radio();
        stat.setCurrentRadioWave(8);
        stat.stepBackRadioWave();
        int expected = 7;
        int actual = stat.getCurrentRadioWave();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(6);
        int expected = 6;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetUnderMinVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(-1);
        int expected = 0;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverMaxVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(11);
        int expected = 0;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(3);
        stat.increaseVolume();
        int expected = 4;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseOverVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(10);
        stat.increaseVolume();
        int expected = stat.currentVolume;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldReduceVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(3);
        stat.reduceVolume();
        int expected = 2;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceMinVolume() {
        Radio stat = new Radio();
        stat.setCurrentVolume(0);
        stat.reduceVolume();
        int expected = stat.currentVolume;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

