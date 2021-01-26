package com.donglan.pojo;

public class ProvincialRoad {
    private Integer fid;

    private Integer objectid;

    private String dlbm;

    private String name;

    private Double shapeLeng;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getObjectid() {
        return objectid;
    }

    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    public String getDlbm() {
        return dlbm;
    }

    public void setDlbm(String dlbm) {
        this.dlbm = dlbm == null ? null : dlbm.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getShapeLeng() {
        return shapeLeng;
    }

    public void setShapeLeng(Double shapeLeng) {
        this.shapeLeng = shapeLeng;
    }
}