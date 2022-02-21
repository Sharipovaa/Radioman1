package ru.netology;

public class Radioman {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void pressNext() {
        if (currentRadioStation < 9) {
            this.currentRadioStation = currentRadioStation + 1;
        } else {
            this.currentRadioStation = 0;
        }
    }

    public void pressPrev() {
        if (currentRadioStation > 0) {
            this.currentRadioStation = currentRadioStation - 1;
        } else {
            this.currentRadioStation = 9;
        }
    }

    public void setCurrentRadioStation1(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void increaseVolumeMax() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }

    public void increaseVolumeMin() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }
}