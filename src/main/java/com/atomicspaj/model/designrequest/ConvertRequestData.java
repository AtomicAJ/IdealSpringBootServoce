/*
 * Copyright (c) 2022.
 * BrickNBolt, Pluckwalk Technologies Pvt. Ltd
 *  All rights reserved.
 */

package com.atomicspaj.model.designrequest;

import com.atomicspaj.model.CustomerDetails;

import java.util.ArrayList;
import java.util.Date;

public class ConvertRequestData{
    public String id = "627b8035a8ed27137628a788";
    public String label = "Develop1";
    public String constructionType ="residential";
    public ArrayList<String> unitsInProject = new ArrayList<String>() {
        {
            add("PentHouse");
            add("Apartment");
            add("Independant House");
            add("Farm House");
        }
    };;
    public String projectType;
    public String plotDimensions = "40X40";
    public ActualDimensions actualDimensions;
    public Object numberOfRooms;
    public Object floorToFloorHeight;
    public boolean isCornerPlot = true;
    public Object irregularDimensions;
    public int noOfFloors = 1;
    public ArrayList<RoadFacingSide> roadFacingSides;
    public int noOfSidesRoadFacing = 2;
    public ArrayList<FloorDesignInformation> floorDesignInformations;
    public ArrayList<DesignInformation> designInformations;
    public Object createdByName;
    public Object createdById;
    public Date createdAt = new Date();
    public Date updatedAt = new Date();
    public int version = 0;
    public boolean isFinalVersion = false;
    public Object constructionMethods;
    public Object architectureType;
    public boolean porticoPresent = true;
    public String crnId = "CRN999";
    public String projectId = "5ca3109a11c7b1260ebf7115";
    public boolean published = false;
    public boolean sentAsMail = false;
    public CustomerDetails customerDetails;
    public Object areaUnit;
    public boolean isDuplex = false;
    public boolean liftRequire = true;
    public Object noteToCustomer = true;
    public Object constructionTypeValue;
    public boolean isBalconyRequirement;
    public ArrayList<String> balconyDirections = new ArrayList<String>() {
        {
            add("North");
            add("South");
            add("East");
            add("West");
        }
    };;
    public boolean hasBasement = true;
    public int heightOfBasement = 5;
    public int heightOfBasementBelowGround = 5;
    public int totalHeightOfBasement = 5;
    public ArrayList<DigitalDimension> digitalDimensions;
    public SiteOrientationDirection siteOrientationDirection;
    public ArrayList<AdjacentPropertiesInformation> adjacentPropertiesInformation = new ArrayList<AdjacentPropertiesInformation>();
    public Object adjacentPropertiesInformationPresent;
    public Object numberOfAdjacentSideDirectionSetBacksPresent;
    public boolean slopePresent = false;
    public Object slopeType;
    public Object treePositioning;
    public Object numberOfTreePosition;
    public Object treePositions;
    public boolean isVaastuCompliant = true;
    public Object scaleVaastuBeleive;
    public Object kitchenFacing;
    public Object washroomFacing;
    public boolean isPoojaRoomRequired = false;
    public Object poojaRoomFacing;
    public Object entranceDoor;
    public boolean futureExpensionPlan = false;
    public Object futureExpensionPlanNumberOfFloor;
    public boolean borewellPresent = true;
    public int borewellDistanceFromNorth = 12;
    public Object borewellDistanceFromEast;
    public Object projectSetBacksPresent;
    public Object numberOfDirectionSetBacksPresent;
    public ArrayList<ProjectSetBack> projectSetBacks = new ArrayList<ProjectSetBack>();
    public boolean gardenRequired = true;
    public Object gardenDirection;
    public int externalWallThickness = 10;
    public int internalWallThickness = 10;
    public boolean skylight = true;
    public String numberOfCarPark = "TWO";
    public int parkingHeightRespectToRoad = 10;
    public int plinthLevelwithRespectToParking = 10;
    public String washRoomLevel = "Ground";
    public String locationOfSump = "Land";
    public boolean isDakRequirementOfGroundFloor = true;
    public String dakRequirementOfGroundFloor = "Two";
    public boolean isCourtyardRequirement = true;
    public Object courtyardDirection;
    public Object is3d;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getConstructionType() {
        return constructionType;
    }

    public void setConstructionType(String constructionType) {
        this.constructionType = constructionType;
    }

    public ArrayList<String> getUnitsInProject() {
        return unitsInProject;
    }

    public void setUnitsInProject(ArrayList<String> unitsInProject) {
        this.unitsInProject = unitsInProject;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getPlotDimensions() {
        return plotDimensions;
    }

    public void setPlotDimensions(String plotDimensions) {
        this.plotDimensions = plotDimensions;
    }

    public ActualDimensions getActualDimensions() {
        return actualDimensions;
    }

    public void setActualDimensions(ActualDimensions actualDimensions) {
        this.actualDimensions = actualDimensions;
    }

    public Object getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Object numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Object getFloorToFloorHeight() {
        return floorToFloorHeight;
    }

    public void setFloorToFloorHeight(Object floorToFloorHeight) {
        this.floorToFloorHeight = floorToFloorHeight;
    }

    public boolean isCornerPlot() {
        return isCornerPlot;
    }

    public void setCornerPlot(boolean cornerPlot) {
        isCornerPlot = cornerPlot;
    }

    public Object getIrregularDimensions() {
        return irregularDimensions;
    }

    public void setIrregularDimensions(Object irregularDimensions) {
        this.irregularDimensions = irregularDimensions;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    public ArrayList<RoadFacingSide> getRoadFacingSides() {
        return roadFacingSides;
    }

    public void setRoadFacingSides(ArrayList<RoadFacingSide> roadFacingSides) {
        this.roadFacingSides = roadFacingSides;
    }

    public int getNoOfSidesRoadFacing() {
        return noOfSidesRoadFacing;
    }

    public void setNoOfSidesRoadFacing(int noOfSidesRoadFacing) {
        this.noOfSidesRoadFacing = noOfSidesRoadFacing;
    }

    public ArrayList<FloorDesignInformation> getFloorDesignInformations() {
        return floorDesignInformations;
    }

    public void setFloorDesignInformations(ArrayList<FloorDesignInformation> floorDesignInformations) {
        this.floorDesignInformations = floorDesignInformations;
    }

    public ArrayList<DesignInformation> getDesignInformations() {
        return designInformations;
    }

    public void setDesignInformations(ArrayList<DesignInformation> designInformations) {
        this.designInformations = designInformations;
    }

    public Object getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(Object createdByName) {
        this.createdByName = createdByName;
    }

    public Object getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Object createdById) {
        this.createdById = createdById;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean isFinalVersion() {
        return isFinalVersion;
    }

    public void setFinalVersion(boolean finalVersion) {
        isFinalVersion = finalVersion;
    }

    public Object getConstructionMethods() {
        return constructionMethods;
    }

    public void setConstructionMethods(Object constructionMethods) {
        this.constructionMethods = constructionMethods;
    }

    public Object getArchitectureType() {
        return architectureType;
    }

    public void setArchitectureType(Object architectureType) {
        this.architectureType = architectureType;
    }

    public boolean isPorticoPresent() {
        return porticoPresent;
    }

    public void setPorticoPresent(boolean porticoPresent) {
        this.porticoPresent = porticoPresent;
    }

    public String getCrnId() {
        return crnId;
    }

    public void setCrnId(String crnId) {
        this.crnId = crnId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public boolean isSentAsMail() {
        return sentAsMail;
    }

    public void setSentAsMail(boolean sentAsMail) {
        this.sentAsMail = sentAsMail;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    public Object getAreaUnit() {
        return areaUnit;
    }

    public void setAreaUnit(Object areaUnit) {
        this.areaUnit = areaUnit;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }

    public boolean isLiftRequire() {
        return liftRequire;
    }

    public void setLiftRequire(boolean liftRequire) {
        this.liftRequire = liftRequire;
    }

    public Object getNoteToCustomer() {
        return noteToCustomer;
    }

    public void setNoteToCustomer(Object noteToCustomer) {
        this.noteToCustomer = noteToCustomer;
    }

    public Object getConstructionTypeValue() {
        return constructionTypeValue;
    }

    public void setConstructionTypeValue(Object constructionTypeValue) {
        this.constructionTypeValue = constructionTypeValue;
    }

    public boolean isBalconyRequirement() {
        return isBalconyRequirement;
    }

    public void setBalconyRequirement(boolean balconyRequirement) {
        isBalconyRequirement = balconyRequirement;
    }

    public ArrayList<String> getBalconyDirections() {
        return balconyDirections;
    }

    public void setBalconyDirections(ArrayList<String> balconyDirections) {
        this.balconyDirections = balconyDirections;
    }

    public boolean isHasBasement() {
        return hasBasement;
    }

    public void setHasBasement(boolean hasBasement) {
        this.hasBasement = hasBasement;
    }

    public int getHeightOfBasement() {
        return heightOfBasement;
    }

    public void setHeightOfBasement(int heightOfBasement) {
        this.heightOfBasement = heightOfBasement;
    }

    public int getHeightOfBasementBelowGround() {
        return heightOfBasementBelowGround;
    }

    public void setHeightOfBasementBelowGround(int heightOfBasementBelowGround) {
        this.heightOfBasementBelowGround = heightOfBasementBelowGround;
    }

    public int getTotalHeightOfBasement() {
        return totalHeightOfBasement;
    }

    public void setTotalHeightOfBasement(int totalHeightOfBasement) {
        this.totalHeightOfBasement = totalHeightOfBasement;
    }

    public ArrayList<DigitalDimension> getDigitalDimensions() {
        return digitalDimensions;
    }

    public void setDigitalDimensions(ArrayList<DigitalDimension> digitalDimensions) {
        this.digitalDimensions = digitalDimensions;
    }

    public SiteOrientationDirection getSiteOrientationDirection() {
        return siteOrientationDirection;
    }

    public void setSiteOrientationDirection(SiteOrientationDirection siteOrientationDirection) {
        this.siteOrientationDirection = siteOrientationDirection;
    }

    public ArrayList<AdjacentPropertiesInformation> getAdjacentPropertiesInformation() {
        return adjacentPropertiesInformation;
    }

    public void setAdjacentPropertiesInformation(ArrayList<AdjacentPropertiesInformation> adjacentPropertiesInformation) {
        this.adjacentPropertiesInformation = adjacentPropertiesInformation;
    }

    public Object getAdjacentPropertiesInformationPresent() {
        return adjacentPropertiesInformationPresent;
    }

    public void setAdjacentPropertiesInformationPresent(Object adjacentPropertiesInformationPresent) {
        this.adjacentPropertiesInformationPresent = adjacentPropertiesInformationPresent;
    }

    public Object getNumberOfAdjacentSideDirectionSetBacksPresent() {
        return numberOfAdjacentSideDirectionSetBacksPresent;
    }

    public void setNumberOfAdjacentSideDirectionSetBacksPresent(Object numberOfAdjacentSideDirectionSetBacksPresent) {
        this.numberOfAdjacentSideDirectionSetBacksPresent = numberOfAdjacentSideDirectionSetBacksPresent;
    }

    public boolean isSlopePresent() {
        return slopePresent;
    }

    public void setSlopePresent(boolean slopePresent) {
        this.slopePresent = slopePresent;
    }

    public Object getSlopeType() {
        return slopeType;
    }

    public void setSlopeType(Object slopeType) {
        this.slopeType = slopeType;
    }

    public Object getTreePositioning() {
        return treePositioning;
    }

    public void setTreePositioning(Object treePositioning) {
        this.treePositioning = treePositioning;
    }

    public Object getNumberOfTreePosition() {
        return numberOfTreePosition;
    }

    public void setNumberOfTreePosition(Object numberOfTreePosition) {
        this.numberOfTreePosition = numberOfTreePosition;
    }

    public Object getTreePositions() {
        return treePositions;
    }

    public void setTreePositions(Object treePositions) {
        this.treePositions = treePositions;
    }

    public boolean isVaastuCompliant() {
        return isVaastuCompliant;
    }

    public void setVaastuCompliant(boolean vaastuCompliant) {
        isVaastuCompliant = vaastuCompliant;
    }

    public Object getScaleVaastuBeleive() {
        return scaleVaastuBeleive;
    }

    public void setScaleVaastuBeleive(Object scaleVaastuBeleive) {
        this.scaleVaastuBeleive = scaleVaastuBeleive;
    }

    public Object getKitchenFacing() {
        return kitchenFacing;
    }

    public void setKitchenFacing(Object kitchenFacing) {
        this.kitchenFacing = kitchenFacing;
    }

    public Object getWashroomFacing() {
        return washroomFacing;
    }

    public void setWashroomFacing(Object washroomFacing) {
        this.washroomFacing = washroomFacing;
    }

    public boolean isPoojaRoomRequired() {
        return isPoojaRoomRequired;
    }

    public void setPoojaRoomRequired(boolean poojaRoomRequired) {
        isPoojaRoomRequired = poojaRoomRequired;
    }

    public Object getPoojaRoomFacing() {
        return poojaRoomFacing;
    }

    public void setPoojaRoomFacing(Object poojaRoomFacing) {
        this.poojaRoomFacing = poojaRoomFacing;
    }

    public Object getEntranceDoor() {
        return entranceDoor;
    }

    public void setEntranceDoor(Object entranceDoor) {
        this.entranceDoor = entranceDoor;
    }

    public boolean isFutureExpensionPlan() {
        return futureExpensionPlan;
    }

    public void setFutureExpensionPlan(boolean futureExpensionPlan) {
        this.futureExpensionPlan = futureExpensionPlan;
    }

    public Object getFutureExpensionPlanNumberOfFloor() {
        return futureExpensionPlanNumberOfFloor;
    }

    public void setFutureExpensionPlanNumberOfFloor(Object futureExpensionPlanNumberOfFloor) {
        this.futureExpensionPlanNumberOfFloor = futureExpensionPlanNumberOfFloor;
    }

    public boolean isBorewellPresent() {
        return borewellPresent;
    }

    public void setBorewellPresent(boolean borewellPresent) {
        this.borewellPresent = borewellPresent;
    }

    public int getBorewellDistanceFromNorth() {
        return borewellDistanceFromNorth;
    }

    public void setBorewellDistanceFromNorth(int borewellDistanceFromNorth) {
        this.borewellDistanceFromNorth = borewellDistanceFromNorth;
    }

    public Object getBorewellDistanceFromEast() {
        return borewellDistanceFromEast;
    }

    public void setBorewellDistanceFromEast(Object borewellDistanceFromEast) {
        this.borewellDistanceFromEast = borewellDistanceFromEast;
    }

    public Object getProjectSetBacksPresent() {
        return projectSetBacksPresent;
    }

    public void setProjectSetBacksPresent(Object projectSetBacksPresent) {
        this.projectSetBacksPresent = projectSetBacksPresent;
    }

    public Object getNumberOfDirectionSetBacksPresent() {
        return numberOfDirectionSetBacksPresent;
    }

    public void setNumberOfDirectionSetBacksPresent(Object numberOfDirectionSetBacksPresent) {
        this.numberOfDirectionSetBacksPresent = numberOfDirectionSetBacksPresent;
    }

    public ArrayList<ProjectSetBack> getProjectSetBacks() {
        return projectSetBacks;
    }

    public void setProjectSetBacks(ArrayList<ProjectSetBack> projectSetBacks) {
        this.projectSetBacks = projectSetBacks;
    }

    public boolean isGardenRequired() {
        return gardenRequired;
    }

    public void setGardenRequired(boolean gardenRequired) {
        this.gardenRequired = gardenRequired;
    }

    public Object getGardenDirection() {
        return gardenDirection;
    }

    public void setGardenDirection(Object gardenDirection) {
        this.gardenDirection = gardenDirection;
    }

    public int getExternalWallThickness() {
        return externalWallThickness;
    }

    public void setExternalWallThickness(int externalWallThickness) {
        this.externalWallThickness = externalWallThickness;
    }

    public int getInternalWallThickness() {
        return internalWallThickness;
    }

    public void setInternalWallThickness(int internalWallThickness) {
        this.internalWallThickness = internalWallThickness;
    }

    public boolean isSkylight() {
        return skylight;
    }

    public void setSkylight(boolean skylight) {
        this.skylight = skylight;
    }

    public String getNumberOfCarPark() {
        return numberOfCarPark;
    }

    public void setNumberOfCarPark(String numberOfCarPark) {
        this.numberOfCarPark = numberOfCarPark;
    }

    public int getParkingHeightRespectToRoad() {
        return parkingHeightRespectToRoad;
    }

    public void setParkingHeightRespectToRoad(int parkingHeightRespectToRoad) {
        this.parkingHeightRespectToRoad = parkingHeightRespectToRoad;
    }

    public int getPlinthLevelwithRespectToParking() {
        return plinthLevelwithRespectToParking;
    }

    public void setPlinthLevelwithRespectToParking(int plinthLevelwithRespectToParking) {
        this.plinthLevelwithRespectToParking = plinthLevelwithRespectToParking;
    }

    public String getWashRoomLevel() {
        return washRoomLevel;
    }

    public void setWashRoomLevel(String washRoomLevel) {
        this.washRoomLevel = washRoomLevel;
    }

    public String getLocationOfSump() {
        return locationOfSump;
    }

    public void setLocationOfSump(String locationOfSump) {
        this.locationOfSump = locationOfSump;
    }

    public boolean isDakRequirementOfGroundFloor() {
        return isDakRequirementOfGroundFloor;
    }

    public void setDakRequirementOfGroundFloor(boolean dakRequirementOfGroundFloor) {
        isDakRequirementOfGroundFloor = dakRequirementOfGroundFloor;
    }

    public String getDakRequirementOfGroundFloor() {
        return dakRequirementOfGroundFloor;
    }

    public void setDakRequirementOfGroundFloor(String dakRequirementOfGroundFloor) {
        this.dakRequirementOfGroundFloor = dakRequirementOfGroundFloor;
    }

    public boolean isCourtyardRequirement() {
        return isCourtyardRequirement;
    }

    public void setCourtyardRequirement(boolean courtyardRequirement) {
        isCourtyardRequirement = courtyardRequirement;
    }

    public Object getCourtyardDirection() {
        return courtyardDirection;
    }

    public void setCourtyardDirection(Object courtyardDirection) {
        this.courtyardDirection = courtyardDirection;
    }

    public Object getIs3d() {
        return is3d;
    }

    public void setIs3d(Object is3d) {
        this.is3d = is3d;
    }
}


