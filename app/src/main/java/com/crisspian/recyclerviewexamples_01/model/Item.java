package com.crisspian.recyclerviewexamples_01.model;

public class Item {

    private String itemDescription;
    private String urlImage;
    private String price;

    public Item(String itemDescription, String urlImage,String price) {
        this.itemDescription = itemDescription;
        this.urlImage = urlImage;
        this.price=price;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {

        this.price = price;
    }







    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
