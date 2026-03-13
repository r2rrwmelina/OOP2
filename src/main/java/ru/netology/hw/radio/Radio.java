package ru.netology.hw.radio;

public class Radio {
    private int totalStations;
    private int maxStation;
    private int minStation = 0;
    private int currentStationNum = minStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio() {
        this.totalStations = 10;
        this.maxStation = 9;
    }
    public Radio(int totalStations) {
        this.totalStations = totalStations;
        this.maxStation = totalStations - 1;
        this.currentStationNum = minStation;
    }

    public int getTotalStations() {
        return totalStations;
    }

    public int getCurrentStationNum() {
        return currentStationNum;
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

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
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
