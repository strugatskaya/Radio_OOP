package ru.netology.domain;

public class Radio {
    private int currentRadioWave;
    int minRadioWave = 0;
    int maxRadioWave = 9;
    int maxVolume = 10;
    int minVolume = 0;
    private int currentVolume;

    public int getCurrentRadioWave() {
        return currentRadioWave;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioWave(int currentRadioWave) {
        if (currentRadioWave < minRadioWave) {
            return;
        }
        if (currentRadioWave > maxRadioWave) {
            return;
        }
        this.currentRadioWave = currentRadioWave;
    }

    public int setNextRadioWaveAndBackToMin() {
        if (currentRadioWave < maxRadioWave) {
            currentRadioWave = currentRadioWave + 1;
        } else {
            currentRadioWave = minRadioWave;

        }
        return currentRadioWave;

    }

    public int setPreviousRadioWaveAndBackToMax() {
        if (currentRadioWave > minRadioWave) {
            currentRadioWave = currentRadioWave - 1;
        } else {
            currentRadioWave = maxRadioWave;
        }
        return currentRadioWave;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int setNextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = this.currentVolume + 1;
        } else {
            currentRadioWave = currentVolume;

        }
        return currentVolume;

    }

    public int setPreviousVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = currentVolume;
        }
        return currentVolume;


    }
}

