package ru.netology.domain;

public class Radio {

    private int radioWaveNumber = 10;
    private int currentRadioWave;
    private int minRadioWave = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public int getRadioWaveNumber() {
        return radioWaveNumber;
    }

    public int getCurrentRadioWave() {

        return currentRadioWave;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getMinRadioWave() {
        return minRadioWave;
    }

    // public int getMaxRadioWave() {
    // return maxRadioWave;
    // }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public Radio() {

    }

    public Radio(int currentRadioWave, int minRadioWave, int radioWaveNumber, int currentVolume, int maxVolume, int minVolume) {
        this.radioWaveNumber = radioWaveNumber;
        this.currentRadioWave = currentRadioWave;
        this.minRadioWave = minRadioWave;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public long setCurrentRadioWave() {
        if (currentRadioWave < minRadioWave) {
            currentRadioWave = minRadioWave;
        } else {
            if (currentRadioWave > radioWaveNumber) {
                currentRadioWave = radioWaveNumber;
            }
        }
        return currentRadioWave;
    }

    public int setNextRadioWaveAndBackToMin() {
        if (currentRadioWave < radioWaveNumber) {
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
            currentRadioWave = radioWaveNumber;
        }
        return currentRadioWave;
    }

    public int setCurrentVolume() {
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        } else {

            if (currentVolume > maxVolume) {
                currentVolume = maxVolume;
            }
        }
        return currentVolume;
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

