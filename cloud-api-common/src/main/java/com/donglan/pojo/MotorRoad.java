package com.donglan.pojo;

public class MotorRoad {
    private Integer fid;

    private Integer osmId;

    private String fclass;

    private String name;

    private String ref;

    private String oneway;

    private Integer maxspeed;

    private Integer layer;

    private String bridge;

    private String tunnel;

    private Double shapeLeng;

    private Double length;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getOsmId() {
        return osmId;
    }

    public void setOsmId(Integer osmId) {
        this.osmId = osmId;
    }

    public String getFclass() {
        return fclass;
    }

    public void setFclass(String fclass) {
        this.fclass = fclass == null ? null : fclass.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref == null ? null : ref.trim();
    }

    public String getOneway() {
        return oneway;
    }

    public void setOneway(String oneway) {
        this.oneway = oneway == null ? null : oneway.trim();
    }

    public Integer getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(Integer maxspeed) {
        this.maxspeed = maxspeed;
    }

    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    public String getBridge() {
        return bridge;
    }

    public void setBridge(String bridge) {
        this.bridge = bridge == null ? null : bridge.trim();
    }

    public String getTunnel() {
        return tunnel;
    }

    public void setTunnel(String tunnel) {
        this.tunnel = tunnel == null ? null : tunnel.trim();
    }

    public Double getShapeLeng() {
        return shapeLeng;
    }

    public void setShapeLeng(Double shapeLeng) {
        this.shapeLeng = shapeLeng;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }
}