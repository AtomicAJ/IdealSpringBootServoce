/*
 * Copyright (c) 2022.
 * BrickNBolt, Pluckwalk Technologies Pvt. Ltd
 *  All rights reserved.
 */

package com.atomicspaj.model.designresponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class DesignResponseData {

    @JsonProperty("Construction Type")
    private String constructionType;
    @JsonProperty("Construction Sub-Type")
    private List<String> constructionSubType;
    @JsonProperty("Project Tye")
    private String projectType;
    @JsonProperty("Is Corner Plot")
    private String isCornerPlot;
    @JsonProperty("Plot Have Irregular Dimensions")
    private String isPlotRegistrationDone;
    @JsonProperty("Portico Present")
    private String porticoPresent;




}
