package ru.netology;

public class Radio {
    private int currentRadioWave;
    private int currentVolume;

    public int getCurrentRadioWave() {

        return currentRadioWave;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentRadioWave(int currentRadioWave) {
        if (currentRadioWave < 0) {
            return;
        }
        if (currentRadioWave > 9) {
            return;
        }

        this.currentRadioWave = currentRadioWave;
    }

    public void nextRadioWave() {

        if (currentRadioWave != 9) {
            currentRadioWave++;
        } else {
            currentRadioWave = 0;
        }


    }


    public void stepBackRadioWave() {

        if (currentRadioWave != 0) {
            currentRadioWave--;
        } else {
            currentRadioWave = 9;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
