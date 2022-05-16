/*
 * Copyright (c) 2022.
 * BrickNBolt, Pluckwalk Technologies Pvt. Ltd
 *  All rights reserved.
 */

package com.atomicspaj.model.designrequest;
public class SetBacks {
    public int value = 1;
    public String direction = "South";
    public Object areaUnit;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Object getAreaUnit() {
        return areaUnit;
    }

    public void setAreaUnit(Object areaUnit) {
        this.areaUnit = areaUnit;
    }
}
