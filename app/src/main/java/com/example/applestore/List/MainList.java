package com.example.applestore.List;

public class MainList {

    String TextProduct;
    int ImageProduct;

    public MainList(String textProduct, int imageProduct) {
        TextProduct = textProduct;
        ImageProduct = imageProduct;
    }

    public String getTextProduct() {
        return TextProduct;
    }

    public int getImageProduct() {
        return ImageProduct;
    }

    public void setTextProduct(String textProduct) {
        TextProduct = textProduct;
    }

    public void setImageProduct(int imageProduct) {
        ImageProduct = imageProduct;
    }
}
