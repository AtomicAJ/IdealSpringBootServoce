/*
 * Copyright (c) 2022.
 * BrickNBolt, Pluckwalk Technologies Pvt. Ltd
 *  All rights reserved.
 */

package com.atomicspaj.model.designrequest;

import java.util.ArrayList;

public class FloorDesignInformation {
    public String floor;
    public ArrayList<ConstructionUnitInformation> constructionUnitInformations;
    public ArrayList<DesignInformation> designInformations;
    public Object numberOfRooms;
    public Object numberOfUnitsPerFloor;
    public Object floorHeight;
    public boolean duplex = false;

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public ArrayList<ConstructionUnitInformation> getConstructionUnitInformations() {
        return constructionUnitInformations;
    }

    public void setConstructionUnitInformations(ArrayList<ConstructionUnitInformation> constructionUnitInformations) {
        this.constructionUnitInformations = constructionUnitInformations;
    }

    public ArrayList<DesignInformation> getDesignInformations() {
        return designInformations;
    }

    public void setDesignInformations(ArrayList<DesignInformation> designInformations) {
        this.designInformations = designInformations;
    }

    public Object getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Object numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Object getNumberOfUnitsPerFloor() {
        return numberOfUnitsPerFloor;
    }

    public void setNumberOfUnitsPerFloor(Object numberOfUnitsPerFloor) {
        this.numberOfUnitsPerFloor = numberOfUnitsPerFloor;
    }

    public Object getFloorHeight() {
        return floorHeight;
    }

    public void setFloorHeight(Object floorHeight) {
        this.floorHeight = floorHeight;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
}
