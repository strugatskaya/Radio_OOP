package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test

    public void ShouldSetRadioWavePositive9() {
        Radio radio = new Radio(9, 1, 20, 100, 100, 0);
        assertEquals(9, radio.getCurrentRadioWave());
    }


    @Test
    public void ShouldSetRadioWavePositive1() {
        Radio radio = new Radio(1, 0, 9, 100, 100, 0);
        assertEquals(1, radio.getCurrentRadioWave());
    }

    @Test
    public void ShouldSetRadioWavePositive0() {
        Radio radio = new Radio(0, 0, 9, 100, 100, 0);
        assertEquals(0, radio.getCurrentRadioWave());
    }

    @Test
    public void ShouldSetRadioWavePositive5() {
        Radio radio = new Radio(5, 0, 9, 100, 100, 0);
        assertEquals(5, radio.getCurrentRadioWave());
    }

    @Test
    public void ShouldSetRadioWaveNegative() {
        Radio radio = new Radio(-1, 0, 9, 100, 100, 0);
        assertEquals(0, radio.setCurrentRadioWave());
    }

    @Test
    public void ShouldSetRadioWaveNegative10() {
        Radio radio = new Radio(10, 0, 9, 100, 100, 0);
        assertEquals(9, radio.setCurrentRadioWave());
    }

    @Test
    public void ShouldSetNextRadioWavePositive8() {
        Radio radio = new Radio(8, 0, 9, 100, 100, 0);
        assertEquals(9, radio.setNextRadioWaveAndBackToMin());
    }

    @Test
    public void ShouldSetNextRadioWavePositive0() {
        Radio radio = new Radio(0, 0, 9, 100, 100, 0);
        assertEquals(1, radio.setNextRadioWaveAndBackToMin());
    }

    @Test
    public void ShouldSetNextRadioWaveNegative199() {
        Radio radio = new Radio(199, 6, 200, 100, 100, 0);
        assertEquals(200, radio.setNextRadioWaveAndBackToMin());
    }

    @Test
    public void ShouldSetPreviousRadioWavePositive1() {
        Radio radio = new Radio(1, 0, 9, 100, 100, 0);
        assertEquals(0, radio.setPreviousRadioWaveAndBackToMax());
    }

    @Test
    public void ShouldSetPreviousRadioWavePositive9() {
        Radio radioRock = new Radio(9, 0, 9, 100, 100, 0);
        assertEquals(8, radioRock.setPreviousRadioWaveAndBackToMax());
    }

    @Test
    public void ShouldSetPreviousRadioWaveNegative0() {
        Radio radio = new Radio(0, 0, 9, 100, 100, 0);
        assertEquals(9, radio.setPreviousRadioWaveAndBackToMax());

    }

    // тесты для громкости
    @Test

    public void ShouldSetVolumePositive100() {
        Radio radio = new Radio(9, 0, 9, 100, 100, 0);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumePositive0() {
        Radio radio = new Radio(9, 0, 9, 0, 100, 0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumePositive1() {
        Radio radio = new Radio(9, 0, 9, 1, 100, 0);
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumePositive99() {
        Radio radio = new Radio(9, 0, 9, 99, 100, 0);
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumeNegative() {
        Radio radio = new Radio(9, 0, 9, -1, 100, 0);
        assertEquals(0, radio.setCurrentVolume());
    }

    @Test
    public void ShouldSetVolumeNegative101() {
        Radio radio = new Radio(9, 0, 9, 101, 100, 0);
        assertEquals(100, radio.setCurrentVolume());
    }

    @Test
    public void ShouldSetNextVolumePositive99() {
        Radio radio = new Radio(9, 0, 9, 99, 100, 0);
        assertEquals(100, radio.setNextVolume());
    }

    @Test
    public void ShouldSetNextVolumePositive0() {
        Radio radio = new Radio(9, 0, 9, 0, 100, 0);
        assertEquals(1, radio.setNextVolume());
    }


    @Test
    public void ShouldSetNextVolumeNegative100() {
        Radio radio = new Radio(9, 0, 9, 100, 100, 0);
        assertEquals(100, radio.setNextVolume());
    }

    @Test
    public void ShouldSetPreviousVolumePositive1() {
        Radio radio = new Radio(9, 0, 9, 1, 100, 0);
        assertEquals(0, radio.setPreviousVolume());
    }

    @Test
    public void ShouldSetPreviousRadioWavePositive100() {
        Radio radio = new Radio(9, 0, 9, 100, 100, 0);
        assertEquals(99, radio.setPreviousVolume());
    }

    @Test
    public void ShouldSetPreviousVolumeNegative0() {
        Radio radio = new Radio(9, 0, 9, 0, 100, 0);
        assertEquals(0, radio.setPreviousVolume());

    }
    // тесты для 100% покрытия по бранчам

    @Test
    public void getMaxRadioWave36() {
        Radio radio = new Radio(36, 9, 34);
        assertEquals(35, radio.getMaxRadioWave());
    }
    @Test
    public void getMaxRadioWave2() {
        Radio radio = new Radio(2, 9, 0);
        assertEquals(1, radio.getMaxRadioWave());
    }

    @Test
    public void RadioConstructor() {
        Radio radio = new Radio();
    }

    @Test
    public void RadioMissedConstructor() {
        Radio radio = new Radio(1, 8,10);
    }
    @Test
    public void GetMinRadioWave() {
        Radio radio = new Radio();
        radio.getMinRadioWave();
    }

    @Test
    public void GetRadioWaveNumber() {
        Radio radio = new Radio();
        radio.getRadioWaveNumber();
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


