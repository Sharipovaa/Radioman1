package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanTest {

    @Test
    void setCurrentRadioStation() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(9);

        int expected = 9;
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
    void pressPrev() {
        Radioman radio = new Radioman();
        radio.setCurrentRadioStation(0);
        radio.pressPrev();

        int expected = 9;
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
}