package ru.netology.hw.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //Проверка работы методов с кол-вом станций по умолчанию

    Radio radio = new Radio();

    @Test
    public void shouldSwitchToTheNextStation() {
        radio.setCurrentStationNum(7);
        radio.next();

        Assertions.assertEquals(8, radio.getCurrentStationNum());
    }

    @Test
    public void shouldCycleToFirstStationFromLast() {
        radio.setCurrentStationNum(9);
        radio.next();

        Assertions.assertEquals(0, radio.getCurrentStationNum());
    }

    @Test
    public void shouldSwitchToThePrevStation() {
        radio.setCurrentStationNum(5);
        radio.prev();

        Assertions.assertEquals(4, radio.getCurrentStationNum());
    }

    @Test
    public void shouldCycleToLastStationFromFirst() {
        radio.setCurrentStationNum(0);
        radio.prev();

        Assertions.assertEquals(9, radio.getCurrentStationNum());
    }

    @Test
    public void shouldSetStationWhenValueBetween0And9() {
        radio.setCurrentStationNum(7);

        Assertions.assertEquals(7, radio.getCurrentStationNum());
    }

    @Test
    public void shouldNotSetStationWhenValueIsBelowMin() {
        radio.setCurrentStationNum(-15);

        Assertions.assertEquals(0, radio.getCurrentStationNum());
    }

    @Test
    public void shouldNotSetStationWhenValueIsAboveMax() {
        radio.setCurrentStationNum(15);

        Assertions.assertEquals(0, radio.getCurrentStationNum());
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        radio.setCurrentVolume(87);
        radio.increaseVolume();

        Assertions.assertEquals(88, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolumeWhenValueIsAboveMax() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        radio.setCurrentVolume(55);
        radio.decreaseVolume();

        Assertions.assertEquals(54, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseCurrentVolumeWhenValueIsMin() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getCurrentStationNum());
    }

    @Test
    public void shouldGetNewTotalStations() {
        Radio radio = new Radio(21);

        Assertions.assertEquals(21, radio.getTotalStations());
    }

    //Проверка работы методов с указанием кол-ва станций

    @Test
    public void shouldSwitchToNextStationWithNewTotalStations() {
        Radio radio = new Radio(35);
        radio.setCurrentStationNum(33);
        radio.next();

        Assertions.assertEquals(34, radio.getCurrentStationNum());
    }

    @Test
    public void shouldCycleToFirstStationFromLastWithNewTotalStations() {
        Radio radio = new Radio(42);
        radio.setCurrentStationNum(41);
        radio.next();

        Assertions.assertEquals(0, radio.getCurrentStationNum());
    }

    @Test
    public void shouldSwitchToThePrevStationWithNewTotalStations() {
        Radio radio = new Radio(35);
        radio.setCurrentStationNum(17);
        radio.prev();

        Assertions.assertEquals(16, radio.getCurrentStationNum());
    }

    @Test
    public void shouldCycleToLastStationFromFirstWithNewTotalStations() {
        Radio radio = new Radio(58);
        radio.setCurrentStationNum(0);
        radio.prev();

        Assertions.assertEquals(57, radio.getCurrentStationNum());
    }

    @Test
    public void shouldSetStationWhenValueBetween0And35() {
        Radio radio = new Radio(35);
        radio.setCurrentStationNum(22);

        Assertions.assertEquals(22, radio.getCurrentStationNum());
    }

    @Test
    public void shouldNotSetStationWhenValueIsAbove35() {
        Radio radio = new Radio(35);
        radio.setCurrentStationNum(40);

        Assertions.assertEquals(0, radio.getCurrentStationNum());
    }
}