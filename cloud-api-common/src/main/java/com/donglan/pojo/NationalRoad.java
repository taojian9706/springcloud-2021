package com.donglan.pojo;

public class NationalRoad {
    private Integer fid;

    private Integer objectid;

    private String dlbm;

    private Integer clasid;

    private Integer clasid92;

    private String name;

    private Double shapeLeng;

    private Double shapeLe1;

    private Double shapeLe2;

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

    public Integer getClasid() {
        return clasid;
    }

    public void setClasid(Integer clasid) {
        this.clasid = clasid;
    }

    public Integer getClasid92() {
        return clasid92;
    }

    public void setClasid92(Integer clasid92) {
        this.clasid92 = clasid92;
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

    public Double getShapeLe1() {
        return shapeLe1;
    }

    public void setShapeLe1(Double shapeLe1) {
        this.shapeLe1 = shapeLe1;
    }

    public Double getShapeLe2() {
        return shapeLe2;
    }

    public void setShapeLe2(Double shapeLe2) {
        this.shapeLe2 = shapeLe2;
    }
}