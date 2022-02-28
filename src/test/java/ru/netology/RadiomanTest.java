package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {

    @Test
    void setRadioStation1 () {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(6);

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setRadioStation2 () {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStation() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStation7() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(7);

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStation5() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStation3() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(3);

        int expected = 3;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStation0() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void pressNext() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(9);
        radio.pressNext();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void pressNext2() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(8);
        radio.pressNext();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void pressNext3() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(7);
        radio.pressNext();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    void pressPrev() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(0);
        radio.pressPrev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void pressPrev1() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(1);
        radio.pressPrev();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void newCurrentRadioStation() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation1(6);

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void newCurrentRadioStation1() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation1(7);

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void newCurrentRadioStation2() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation1(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(0);
        radio.increaseVolumeMax();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeMax() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(10);
        radio.increaseVolumeMax();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeMin() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(0);
        radio.increaseVolumeMin();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void reduceVolume() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(10);
        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void reduceVolume1() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(8);
        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 7;
        assertEquals(expected, actual);
    }
}