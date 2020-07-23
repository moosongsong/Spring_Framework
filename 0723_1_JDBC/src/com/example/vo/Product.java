package com.example.vo;

public class Product {
    private int productId;
    private String productName;
    private int productPrice;
    private int partId;
    private Part part;

    public Product(){}

    public Product(int productId, String productName, int productPrice, int partId) {
        this(productId, productName, productPrice, partId, null);
    }

    public Product(int productId, String productName, int productPrice, int partId, Part part) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.partId = partId;
        this.part = part;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", partId=" + partId +
                ", part=" + part +
                '}';
    }
}
