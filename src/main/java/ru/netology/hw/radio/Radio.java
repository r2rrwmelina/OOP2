package ru.netology.hw.radio;

public class Radio {
    public int currentStationNum;
    public int currentVolume;

    public void switchToNextStation() {
        if (currentStationNum >= 9) {
            currentStationNum = 0;
        } else {
            currentStationNum += 1;
        }
    }

    public void switchToPrevStation() {
        if (currentStationNum <= 0) {
            currentStationNum = 9;
        } else {
            currentStationNum -= 1;
        }
    }

    public void setCurrentStationNum(int newCurrentStationNum) {
        if (newCurrentStationNum > 9 || newCurrentStationNum < 0) {
            return;
        }
        currentStationNum = newCurrentStationNum;
    }

    public void increaseVolume() {
        if (currentVolume >= 100) {
            return;
        }
        currentVolume += 1;
    }

    public void decreaseVolume() {
        if (currentVolume <= 0) {
            return;
        }
        currentVolume -= 1;
    }
}
