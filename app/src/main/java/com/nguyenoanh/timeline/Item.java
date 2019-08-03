package com.nguyenoanh.timeline;



public class Item {



    public enum ItemType {
        ONE_ITEM, TWO_ITEM, THREE_ITEM;
    }

    private String name;
    private String time;
    private String content;
    private  String numberHeart;
    private String numberMess;

    private int avatar;
    private int imageView;

    private ItemType itemType;

    public Item(String name, String time, String numberHeart, String numberMess,int avatar, int imageView, ItemType itemType) {
        this.name = name;
        this.time = time;
        this.numberHeart = numberHeart;
        this.numberMess = numberMess;
        this.avatar = avatar;
        this.imageView = imageView;
        this.itemType = itemType;
    }

    public Item(String name, String time, String content, String numberHeart, String numberMess, int avatar, ItemType itemType) {
        this.name = name;
        this.time = time;
        this.content = content;
        this.numberHeart = numberHeart;
        this.numberMess = numberMess;
        this.avatar = avatar;
        this.itemType = itemType;
    }

    public Item(String name, String time, String content, int avatar, int imageView, ItemType itemType) {
        this.name = name;
        this.time = time;
        this.content = content;
        this.avatar = avatar;
        this.imageView = imageView;
        this.itemType = itemType;
    }

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNumberHeart() {
        return numberHeart;
    }

    public void setNumberHeart(String numberHeart) {
        this.numberHeart = numberHeart;
    }

    public String getNumberMess() {
        return numberMess;
    }

    public void setNumberMess(String numberMess) {
        this.numberMess = numberMess;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }
}
