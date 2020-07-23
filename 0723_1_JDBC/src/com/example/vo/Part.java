package com.example.vo;

public class Part {
    private int partId;
    private String partName;

    public Part(){}

    public Part(int partId, String partName) {
        this.partId = partId;
        this.partName = partName;
    }

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    @Override
    public String toString() {
        return "Part{" +
                "partId='" + partId + '\'' +
                ", partName='" + partName + '\'' +
                '}';
    }
}
