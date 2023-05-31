package ru.netology;

public class Radio {
    public int maxWave = 9;
    public int minWave = 0;
    public int maxVolume = 100;
    public int minVolume = 0;
    public int currentRadioWave = minWave;
    public int currentVolume = minVolume;

    public Radio() {

    }

    public Radio(int amountWave) {

    }

    public int getCurrentRadioWave() {

        return currentRadioWave;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentRadioWave(int currentRadioWave) {
        if (currentRadioWave < minWave) {
            return;
        }
        if (currentRadioWave > maxWave) {
            return;
        }

        this.currentRadioWave = currentRadioWave;
    }

    public void nextRadioWave() {

        if (currentRadioWave != maxWave) {
            currentRadioWave++;
        } else {
            currentRadioWave = minWave;
        }


    }


    public void stepBackRadioWave() {

        if (currentRadioWave != minWave) {
            currentRadioWave--;
        } else {
            currentRadioWave = maxWave;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}
