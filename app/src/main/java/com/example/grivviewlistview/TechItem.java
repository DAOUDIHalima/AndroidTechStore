package com.example.grivviewlistview;

public class TechItem {
    private String img, name , desc;

    public TechItem(String img, String name, String desc) {
        this.img = img;
        this.name = name;
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
