package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class radioTest {

    @Test

    public void ShouldSetRadioWavePositive9() {
        Radio radioRock = new Radio();
        radioRock.setCurrentRadioWave(9);
        int expected = 9;
        assertEquals(expected, radioRock.getCurrentRadioWave());
    }

    public void ShouldSetRadioWavePositive8() {
        Radio radioRock = new Radio();
        radioRock.setCurrentRadioWave(8);
        int expected = 8;
        assertEquals(expected, radioRock.getCurrentRadioWave());
    }

    @Test
    public void ShouldSetRadioWavePositive0() {
        Radio radioRock = new Radio();
        radioRock.setCurrentRadioWave(0);
        int expected = 0;
        assertEquals(expected, radioRock.getCurrentRadioWave());
    }

    @Test
    public void ShouldSetRadioWavePositive1() {
        Radio radioRock = new Radio();
        radioRock.setCurrentRadioWave(1);
        int expected = 1;
        assertEquals(expected, radioRock.getCurrentRadioWave());
    }

    @Test
    public void ShouldSetRadioWaveNegative() {
        Radio radioRock = new Radio();
        radioRock.setCurrentRadioWave(-1);
        int expected = 0;
        assertEquals(expected, radioRock.getCurrentRadioWave());
    }

    @Test
    public void ShouldSetRadioWaveNegative10() {
        Radio radioRock = new Radio();
        radioRock.setCurrentRadioWave(10);
        int expected = 0;
        assertEquals(expected, radioRock.getCurrentRadioWave());
    }

    @Test
    public void ShouldSetNextRadioWavePositive8() {
        Radio radioRock = new Radio();
        radioRock.setCurrentRadioWave(8);
        int expected = 9;
        assertEquals(expected, radioRock.setNextRadioWaveAndBackToMin());
    }

    @Test
    public void ShouldSetNextRadioWavePositive0() {
        Radio radioRock = new Radio();
        radioRock.setCurrentRadioWave(0);
        int expected = 1;
        assertEquals(expected, radioRock.setNextRadioWaveAndBackToMin());
    }

    @Test
    public void ShouldSetNextRadioWaveNegative9() {
        Radio radioRock = new Radio();
        radioRock.setCurrentRadioWave(9);
        int expected = 0;
        assertEquals(expected, radioRock.setNextRadioWaveAndBackToMin());
    }

    @Test
    public void ShouldSetNextRadioWaveNegative10() {
        Radio radioRock = new Radio();
        radioRock.setCurrentRadioWave(9);
        int expected = 0;
        assertEquals(expected, radioRock.setNextRadioWaveAndBackToMin());
    }

    @Test
    public void ShouldSetPreviousRadioWavePositive1() {
        Radio radioRock = new Radio();
        radioRock.setCurrentRadioWave(1);
        int expected = 0;
        assertEquals(expected, radioRock.setPreviousRadioWaveAndBackToMax());
    }

    @Test
    public void ShouldSetPreviousRadioWavePositive9() {
        Radio radioRock = new Radio();
        radioRock.setCurrentRadioWave(1);
        int expected = 0;
        assertEquals(expected, radioRock.setPreviousRadioWaveAndBackToMax());
    }

    @Test
    public void ShouldSetPreviousRadioWaveNegative0() {
        Radio radioRock = new Radio();
        radioRock.setCurrentRadioWave(0);
        int expected = 9;
        assertEquals(expected, radioRock.setPreviousRadioWaveAndBackToMax());

    }

    @Test
    public void ShouldSetPreviousRadioWaveNegative() {
        Radio radioRock = new Radio();
        radioRock.setCurrentRadioWave(-1);
        int expected = 9;
        assertEquals(expected, radioRock.setPreviousRadioWaveAndBackToMax());

    }

    @Test

    public void ShouldSetVolumePositive10() {
        Radio radioRock = new Radio();
        radioRock.setCurrentVolume(10);
        int expected = 10;
        assertEquals(expected, radioRock.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumePositive0() {
        Radio radioRock = new Radio();
        radioRock.setCurrentVolume(0);
        int expected = 0;
        assertEquals(expected, radioRock.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumePositive1() {
        Radio radioRock = new Radio();
        radioRock.setCurrentVolume(1);
        int expected = 1;
        assertEquals(expected, radioRock.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumePositive9() {
        Radio radioRock = new Radio();
        radioRock.setCurrentVolume(9);
        int expected = 9;
        assertEquals(expected, radioRock.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumeNegative11() {
        Radio radioRock = new Radio();
        radioRock.setCurrentVolume(11);
        int expected = 0;
        assertEquals(expected, radioRock.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumeNegative10() {
        Radio radioRock = new Radio();
        radioRock.setCurrentVolume(10);
        int expected = 10;
        assertEquals(expected, radioRock.getCurrentVolume());
    }

    @Test
    public void ShouldSetVolumeNegative() {
        Radio radioRock = new Radio();
        radioRock.setCurrentVolume(-1);
        int expected = 0;
        assertEquals(expected, radioRock.getCurrentVolume());
    }

    @Test
    public void ShouldSetNextVolumePositive9() {
        Radio radioRock = new Radio();
        radioRock.setCurrentVolume(9);
        int expected = 10;
        assertEquals(expected, radioRock.setNextVolume());
    }

    @Test
    public void ShouldSetNextVolumePositive0() {
        Radio radioRock = new Radio();
        radioRock.setCurrentVolume(0);
        int expected = 1;
        assertEquals(expected, radioRock.setNextVolume());
    }

    @Test
    public void ShouldSetNextVolumePositive1() {
        Radio radioRock = new Radio();
        radioRock.setCurrentVolume(1);
        int expected = 2;
        assertEquals(expected, radioRock.setNextVolume());
    }

    @Test
    public void ShouldSetNextVolumeNegative10() {
        Radio radioRock = new Radio();
        radioRock.setCurrentVolume(10);
        int expected = 10;
        assertEquals(expected, radioRock.setNextVolume());
    }

    @Test
    public void ShouldSetPreviousVolumePositive1() {
        Radio radioRock = new Radio();
        radioRock.setCurrentVolume(1);
        int expected = 0;
        assertEquals(expected, radioRock.setPreviousVolume());
    }

    @Test
    public void ShouldSetPreviousVolumePositive2() {
        Radio radioRock = new Radio();
        radioRock.setCurrentVolume(2);
        int expected = 1;
        assertEquals(expected, radioRock.setPreviousVolume());
    }

    @Test
    public void ShouldSetPreviousRadioWavePositive10() {
        Radio radioRock = new Radio();
        radioRock.setCurrentVolume(10);
        int expected = 9;
        assertEquals(expected, radioRock.setPreviousVolume());
    }

    @Test
    public void ShouldSetPreviousVolumeNegative0() {
        Radio radioRock = new Radio();
        radioRock.setCurrentVolume(0);
        int expected = 0;
        assertEquals(expected, radioRock.setPreviousVolume());

    }
}







