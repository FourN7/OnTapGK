package com.example.ontap;

public class HinhAnh {
    private String Name;
    private int Image;
    private  String Link;

    public HinhAnh(String name, int image,String link) {
        Name = name;
        Image = image;
        Link =link;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }
}
