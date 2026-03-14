package ru.netology.hw.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Radio {
    private int totalStations = 10;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStationNum = minStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio(int totalStations) {
        this.totalStations = totalStations;
        this.maxStation = totalStations - 1;
        this.currentStationNum = minStation;
    }

    public void next() {
        if (currentStationNum >= maxStation) {
            currentStationNum = minStation;
        } else {
            currentStationNum += 1;
        }
    }

    public void prev() {
        if (currentStationNum <= minStation) {
            currentStationNum = maxStation;
        } else {
            currentStationNum -= 1;
        }
    }

    public void setCurrentStationNum(int newCurrentStationNum) {
        if (newCurrentStationNum > maxStation || newCurrentStationNum < minStation) {
            return;
        }
        currentStationNum = newCurrentStationNum;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume -= 1;
        }
    }
}