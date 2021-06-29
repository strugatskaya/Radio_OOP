package ru.netology.domain;

public class Radio {

    private int radioWaveNumber;
    private int currentRadioWave;
    private int minRadioWave;
    private int maxRadioWave;
    private int maxVolume;
    private int minVolume;
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

    public int getMaxRadioWave() {
        return maxRadioWave;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public Radio() {

    }

    public Radio(int radioWaveNumber) {
        this.radioWaveNumber = radioWaveNumber;
    }

    public Radio(int radioWaveNumber, int currentRadioWave, int minRadioWave, int maxRadioWave) {
        this.radioWaveNumber = radioWaveNumber;
        this.currentRadioWave = currentRadioWave;
        this.minRadioWave = minRadioWave;
        this.maxRadioWave = maxRadioWave;
    }

    public int setCurrentRadioWave() {
        if (currentRadioWave < minRadioWave) {
            currentRadioWave = minRadioWave;
        } else {
            if (currentRadioWave > maxRadioWave) {
                currentRadioWave = maxRadioWave;
            }
        }
        return currentRadioWave;
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

    public Radio(int currentVolume, int minVolume, int maxVolume) {
        this.currentVolume = currentVolume;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
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

