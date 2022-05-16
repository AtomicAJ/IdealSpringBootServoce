/*
 * Copyright (c) 2022.
 * BrickNBolt, Pluckwalk Technologies Pvt. Ltd
 *  All rights reserved.
 */

package com.atomicspaj.model.designrequest;

import java.util.ArrayList;
public class DesignInformation {
    public String designType = "elevation";
    public Object designTypeDesc;
    public String label = "test";
    public ArrayList<String> designUrls = new ArrayList<String>() {
        {
            add("https://vk-cms-test-bucket.s3-ap-south-1.amazonaws.com/test/quotation (4).pdf");
        }
    };
    public ArrayList<Object> designImageUrls;
    public Object isPdf;

    public String getDesignType() {
        return designType;
    }

    public void setDesignType(String designType) {
        this.designType = designType;
    }

    public Object getDesignTypeDesc() {
        return designTypeDesc;
    }

    public void setDesignTypeDesc(Object designTypeDesc) {
        this.designTypeDesc = designTypeDesc;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ArrayList<String> getDesignUrls() {
        return designUrls;
    }

    public void setDesignUrls(ArrayList<String> designUrls) {
        this.designUrls = designUrls;
    }

    public ArrayList<Object> getDesignImageUrls() {
        return designImageUrls;
    }

    public void setDesignImageUrls(ArrayList<Object> designImageUrls) {
        this.designImageUrls = designImageUrls;
    }

    public Object getIsPdf() {
        return isPdf;
    }

    public void setIsPdf(Object isPdf) {
        this.isPdf = isPdf;
    }
}
