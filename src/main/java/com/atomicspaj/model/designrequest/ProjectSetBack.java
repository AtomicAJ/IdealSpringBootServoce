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
public class ProjectSetBack {
    public Object value;
    public String direction ="South";
    public Object areaUnit;
}
