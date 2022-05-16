/*
 * Copyright (c) 2022.
 * BrickNBolt, Pluckwalk Technologies Pvt. Ltd
 *  All rights reserved.
 */

package com.atomicspaj.model.designrequest;

public class RoadFacingSide {
    public String roadFacingSide = "10";
    public String roadSideFacingDirection = "South";
    public int widthOfRoad = 10;

    public String getRoadFacingSide() {
        return roadFacingSide;
    }

    public void setRoadFacingSide(String roadFacingSide) {
        this.roadFacingSide = roadFacingSide;
    }

    public String getRoadSideFacingDirection() {
        return roadSideFacingDirection;
    }

    public void setRoadSideFacingDirection(String roadSideFacingDirection) {
        this.roadSideFacingDirection = roadSideFacingDirection;
    }

    public int getWidthOfRoad() {
        return widthOfRoad;
    }

    public void setWidthOfRoad(int widthOfRoad) {
        this.widthOfRoad = widthOfRoad;
    }
}
