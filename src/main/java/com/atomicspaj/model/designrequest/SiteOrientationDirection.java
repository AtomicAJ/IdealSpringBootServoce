/*
 * Copyright (c) 2022.
 * BrickNBolt, Pluckwalk Technologies Pvt. Ltd
 *  All rights reserved.
 */

package com.atomicspaj.model.designrequest;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SiteOrientationDirection {
    public Object roadFacingSide;
    public String roadSideFacingDirection;
    public int widthOfRoad;
}
