package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class TownManagement {
    private List<HouseHold> houseHolds = new ArrayList<>();

    public List<HouseHold> getHouseHolds() {
        return houseHolds;
    }

    public void setHouseHolds(List<HouseHold> houseHolds) {
        this.houseHolds = houseHolds;
    }

    public void displayHouseHolds() {
        for (HouseHold houseHold : houseHolds) {
            houseHold.displayHouseHold();
        }
    }

    public void addHouseHold(HouseHold houseHold){
        houseHolds.add(houseHold);
    }

    public void addHouseHold(int index, HouseHold houseHold) {
        houseHolds.add(index, houseHold);
    }

    public void removeHouseHold(int index) {
        houseHolds.remove(index);
    }

    public void updateHouseHold(int index, HouseHold houseHold) {
        houseHolds.set(index, houseHold);
    }


}
