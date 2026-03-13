package ru.netology.hw.radio;

public class Radio {
    private int totalStations;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStationNum = minStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio() {
        this.totalStations = 10;
    }
    public Radio(int totalStations) {
        this.totalStations = totalStations;
        this.maxStation = totalStations - 1;
        this.minStation = 0;
    }


    public int getCurrentStationNum() {
        return currentStationNum;
    }

//    public int getMaxStation() {
//        return maxStation;
//    }
//
//    public int getMinStation() {
//        return minStation;
//    }
//
//    public int getMaxVolume() {
//        return maxVolume;
//    }
//
//    public int getMinVolume() {
//        return minVolume;
//    }

    public void next() {
        if (currentStationNum >= maxStation) {
            currentStationNum = 0;
        } else {
            currentStationNum += 1;
        }
    }

    public void prev() {
        if (currentStationNum <= minStation) {
            currentStationNum = 9;
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
