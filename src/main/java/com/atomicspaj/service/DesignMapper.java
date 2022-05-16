/*
 * Copyright (c) 2022.
 * BrickNBolt, Pluckwalk Technologies Pvt. Ltd
 *  All rights reserved.
 */

package com.atomicspaj.service;

import com.atomicspaj.model.designrequest.ConvertRequestData;
import com.atomicspaj.model.designresponse.DesignResponseData;
import com.atomicspaj.model.mapstruct.MapperRequest;
import com.atomicspaj.model.mapstruct.MapperResponse;
import com.atomicspaj.model.mapstruct.MapperResponseReq;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface DesignMapper {

  @Mapping(target = "constructionType", source = "convertRequestData.constructionType")
  @Mapping(target = "constructionSubType", source = "convertRequestData.unitsInProject")
  DesignResponseData designReqToResMapper(ConvertRequestData convertRequestData);

  @Mapping(target = "testName", source = "mapperRequest.name")
  @Mapping(target = "testId", source = "mapperRequest.id")
  MapperResponse testMapper(MapperRequest mapperRequest);

  MapperResponseReq testSameMapper(MapperRequest mapperRequest);
}
