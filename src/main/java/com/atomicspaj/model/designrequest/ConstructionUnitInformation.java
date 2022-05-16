/*
 * Copyright (c) 2022.
 * BrickNBolt, Pluckwalk Technologies Pvt. Ltd
 *  All rights reserved.
 */

package com.atomicspaj.model.designrequest;

import java.util.ArrayList;

public class ConstructionUnitInformation {
    public int noOfUnits = 1;
    public String constructionUnitType = "Kitchen";
    public Object constructionUnitTypeDesc;
    public ArrayList<CompDimension> compDimensions;
    public Object constructionUnitTypeValue;

    public int getNoOfUnits() {
        return noOfUnits;
    }

    public void setNoOfUnits(int noOfUnits) {
        this.noOfUnits = noOfUnits;
    }

    public String getConstructionUnitType() {
        return constructionUnitType;
    }

    public void setConstructionUnitType(String constructionUnitType) {
        this.constructionUnitType = constructionUnitType;
    }

    public Object getConstructionUnitTypeDesc() {
        return constructionUnitTypeDesc;
    }

    public void setConstructionUnitTypeDesc(Object constructionUnitTypeDesc) {
        this.constructionUnitTypeDesc = constructionUnitTypeDesc;
    }

    public ArrayList<CompDimension> getCompDimensions() {
        return compDimensions;
    }

    public void setCompDimensions(ArrayList<CompDimension> compDimensions) {
        this.compDimensions = compDimensions;
    }

    public Object getConstructionUnitTypeValue() {
        return constructionUnitTypeValue;
    }

    public void setConstructionUnitTypeValue(Object constructionUnitTypeValue) {
        this.constructionUnitTypeValue = constructionUnitTypeValue;
    }
}
