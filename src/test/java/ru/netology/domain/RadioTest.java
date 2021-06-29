package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    // тесты для установки числа радиостанций
    @Test

    public void ShouldSetRadioWaveNumber10() {
        Radio radio = new Radio(10);
        assertEquals(10, radio.getRadioWaveNumber());
    }

    @Test

    public void ShouldSetRadioWaveNumber1() {
        Radio radio = new Radio(1);
        assertEquals(1, radio.getRadioWaveNumber());

    }
// тесты для установки радиостанции


    @Test

    public void ShouldSetRadioWavePositive10() {
        Radio radio = new Radio(10, 10, 0, 10);
        assertEquals(10, radio.getCurrentRadioWave());
    }

    @Test
    public void ShouldSetRadioWavePositive1() {
        Radio radio = new Radio(10, 1, 0, 10);
        assertEquals(1, radio.getCurrentRadioWave());
    }

    @Test
    public void ShouldSetRadioWavePositive0() {
        Radio radio = new Radio(10, 0, 0, 10);
        assertEquals(0, radio.getCurrentRadioWave());
    }

    @Test
    public void ShouldSetRadioWavePositive5() {
        Radio radio = new Radio(10, 5, 0, 10);
        assertEquals(5, radio.getCurrentRadioWave());
    }

    @Test
    public void ShouldSetRadioWaveNegative() {
        Radio radio = new Radio(10, -1, 0, 10);
        assertEquals(0, radio.setCurrentRadioWave());
    }

    @Test
    public void ShouldSetRadioWaveNegative11() {
        Radio radio = new Radio(10, 11, 0, 10);
        assertEquals(10, radio.setCurrentRadioWave());
    }

    @Test
    public void ShouldSetNextRadioWavePositive9() {
        Radio radio = new Radio(10, 9, 0, 10);
        assertEquals(10, radio.setNextRadioWaveAndBackToMin());
    }

    @Test
    public void ShouldSetNextRadioWavePositive0() {
        Radio radio = new Radio(10, 0, 0, 10);
        assertEquals(1, radio.setNextRadioWaveAndBackToMin());
    }

    @Test
    public void ShouldSetNextRadioWaveNegative10() {
        Radio radio = new Radio(10, 10, 0, 10);
        assertEquals(0, radio.setNextRadioWaveAndBackToMin());
    }

    @Test
    public void ShouldSetPreviousRadioWavePositive1() {
        Radio radio = new Radio(10, 1, 0, 10);
        assertEquals(0, radio.setPreviousRadioWaveAndBackToMax());
    }

    @Test
    public void ShouldSetPreviousRadioWavePositiveTEN() {
        Radio radioRock = new Radio(10, 10, 0, 10);
        assertEquals(9, radioRock.setPreviousRadioWaveAndBackToMax());
    }

    @Test
    public void ShouldSetPreviousRadioWaveNegative0() {
        Radio radio = new Radio(10, 0, 0, 10);
        assertEquals(10, radio.setPreviousRadioWaveAndBackToMax());

    }

    // тесты для громкости
    @Test

    public void ShouldSetVolumePositive100() {
        Radio radio = new Radio(100, 0, 100);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumePositive0() {
        Radio radio = new Radio(0, 0, 100);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumePositive1() {
        Radio radio = new Radio(1, 0, 100);
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumePositive99() {
        Radio radio = new Radio(99, 0, 100);
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumeNegative() {
        Radio radio = new Radio(-1, 0, 100);
        assertEquals(0, radio.setCurrentVolume());
    }

    @Test
    public void ShouldSetVolumeNegative101() {
        Radio radio = new Radio(101, 0, 100);
        assertEquals(100, radio.setCurrentVolume());
    }

    @Test
    public void ShouldSetNextVolumePositive99() {
        Radio radio = new Radio(99, 0, 100);
        assertEquals(100, radio.setNextVolume());
    }

    @Test
    public void ShouldSetNextVolumePositive0() {
        Radio radio = new Radio(0, 0, 100);
        assertEquals(1, radio.setNextVolume());
    }


    @Test
    public void ShouldSetNextVolumeNegative100() {
        Radio radio = new Radio(100, 0, 100);
        assertEquals(100, radio.setNextVolume());
    }

    @Test
    public void ShouldSetPreviousVolumePositive1() {
        Radio radio = new Radio(1, 0, 100);
        assertEquals(0, radio.setPreviousVolume());
    }

    @Test
    public void ShouldSetPreviousRadioWavePositive100() {
        Radio radio = new Radio(100, 0, 100);
        assertEquals(99, radio.setPreviousVolume());
    }

    @Test
    public void ShouldSetPreviousVolumeNegative0() {
        Radio radio = new Radio(0, 0, 100);
        assertEquals(0, radio.setPreviousVolume());

    }
    // тесты для 100% покрытия по бранчам

    @Test

    public void RadioConstructor() {
        Radio radio = new Radio();
    }

    @Test
    public void GetMinRadioWave() {
        Radio radio = new Radio();
        radio.getMinRadioWave();
    }

    @Test
    public void GetMaxRadioWave() {
        Radio radio = new Radio();
        radio.getMaxRadioWave();
    }

    @Test
    public void SetPreviousRadioWaveAndBackToMax() {
        Radio radio = new Radio();
        radio.setPreviousRadioWaveAndBackToMax();
    }

    @Test
    public void SetPreviousRadioWaveAndBackToMin() {
        Radio radio = new Radio();
        radio.setNextRadioWaveAndBackToMin();
    }

    @Test
    public void GetCurrentVolume() {
        Radio radio = new Radio();
        radio.getCurrentVolume();
    }

    @Test
    public void GetMinVolume() {
        Radio radio = new Radio();
        radio.getMinVolume();
    }

    @Test
    public void GetMaxVolume() {
        Radio radio = new Radio();
        radio.getMaxVolume();

    }

    @Test
    public void CurrentRadioWaveMaxRadioWave() {
        Radio radio = new Radio();
        assertEquals(0, radio.setCurrentRadioWave());
    }

    @Test
    public void CurrentVolumeMaxVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.setCurrentVolume());
    }
}









