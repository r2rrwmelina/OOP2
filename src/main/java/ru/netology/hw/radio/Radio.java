package ru.netology.hw.radio;

public class Radio {
    private int currentStationNum;
    private int currentVolume;

    public int getCurrentStationNum() {
        return currentStationNum;
    }

    public void next() {
        if (currentStationNum >= 9) {
            currentStationNum = 0;
        } else {
            currentStationNum += 1;
        }
    }

    public void prev() {
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

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
    }
}
