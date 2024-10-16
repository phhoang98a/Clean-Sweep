package com.cleanSweep.backend.domain;

import com.cleanSweep.backend.common.FloorType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cell {
    private int x;
    private int y;
    private FloorType floorType;
    private boolean isVisited;
    private boolean isChargingStation;
    private boolean isObstacle;
    private boolean isStairs;
    private int dirtLevel;

    public void reduceDirtLevel() {
        if (dirtLevel > 0) {
            dirtLevel = 0;
        }
    }
}