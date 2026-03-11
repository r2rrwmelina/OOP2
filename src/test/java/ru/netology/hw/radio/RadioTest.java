package ru.netology.hw.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.image.PackedColorModel;

public class RadioTest {

    @Test
    public void shouldSwitchToTheNextStation() {
        Radio radio = new Radio();
        radio.currentStationNum = 2;
        radio.next();

        int expected = 3;
        int actual = radio.currentStationNum;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCycleToFirstStationFromLast() {
        Radio radio = new Radio();
        radio.currentStationNum = 9;
        radio.next();

        int expected = 0;
        int actual = radio.currentStationNum;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchToThePrevStation() {
        Radio radio = new Radio();
        radio.currentStationNum = 5;
        radio.prev();

        int expected = 4;
        int actual = radio.currentStationNum;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCycleToLastStationFromFirst() {
        Radio radio = new Radio();
        radio.currentStationNum = 0;
        radio.prev();

        int expected = 9;
        int actual = radio.currentStationNum;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationWhenValueBetween0And9() {
        Radio radio = new Radio();
        radio.setCurrentStationNum(7);

        int expected = 7;
        int actual = radio.currentStationNum;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationWhenValueIsBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStationNum(-15);

        int expected = 0;
        int actual = radio.currentStationNum;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationWhenValueIsAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStationNum(15);

        int expected = 0;
        int actual = radio.currentStationNum;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 87;
        radio.increaseVolume();

        int expected = 88;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeWhenValueIsAboveMax() {
        Radio radio = new Radio();
        radio.currentVolume = 100;
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 55;
        radio.decreaseVolume();

        int expected = 54;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseCurrentVolumeWhenValueIsBelowMin() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

}
