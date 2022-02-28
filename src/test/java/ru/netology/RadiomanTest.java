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
    void setCurrentRadioStation1() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(7);

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStation2() {
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
    void setCurrentRadioStation4() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStation5() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStation6() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(2);

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStation7() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentRadioStation8() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(4);

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    void setCurrentRadioStation9() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(6);

        int expected = 6;
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
    void pressPrev2() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(2);
        radio.pressPrev();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void newCurrentRadioStation() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(6);

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void newCurrentRadioStation1() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(7);

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void newCurrentRadioStation2() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeMax() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeMin() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume1() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(2);
        radio.increaseVolume();

        int expected = 3;
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

    @Test
    void reduceVolumeMin() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void reduceVolume3() {
        Radioman radio = new Radioman();
        radio.setCurrentVolume(3);
        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 2;
        assertEquals(expected, actual);
    }
}