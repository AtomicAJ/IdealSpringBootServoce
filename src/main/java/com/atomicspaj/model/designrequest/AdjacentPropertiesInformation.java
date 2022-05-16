/*
 * Copyright (c) 2022.
 * BrickNBolt, Pluckwalk Technologies Pvt. Ltd
 *  All rights reserved.
 */

package com.atomicspaj.model.designrequest;

public class AdjacentPropertiesInformation {
    public SetBacks setBacks;
    public int numberOfFloor = 1;
    public int compoundWallHeight = 1;

    public SetBacks getSetBacks() {
        return setBacks;
    }

    public void setSetBacks(SetBacks setBacks) {
        this.setBacks = setBacks;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public int getCompoundWallHeight() {
        return compoundWallHeight;
    }

    public void setCompoundWallHeight(int compoundWallHeight) {
        this.compoundWallHeight = compoundWallHeight;
    }
}
