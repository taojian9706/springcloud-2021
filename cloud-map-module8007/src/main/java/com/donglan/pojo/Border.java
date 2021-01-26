package com.donglan.pojo;

import java.math.BigDecimal;

public class Border {
    private Integer id;

    private Integer objectId;

    private String name;

    private BigDecimal shapeLeng;

    private BigDecimal shapeArea;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getShapeLeng() {
        return shapeLeng;
    }

    public void setShapeLeng(BigDecimal shapeLeng) {
        this.shapeLeng = shapeLeng;
    }

    public BigDecimal getShapeArea() {
        return shapeArea;
    }

    public void setShapeArea(BigDecimal shapeArea) {
        this.shapeArea = shapeArea;
    }
}