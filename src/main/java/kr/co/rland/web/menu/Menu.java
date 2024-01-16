package kr.co.rland.web.menu;

public class Menu {
    public int getId() {
        return id;
    }

    public String getKorName() {
        return korName;
    }

    public String getEngName() {
        return engName;
    }

    public String getImage() {
        return image;
    }

    public int getPrice() {
        return price;
    }

    public int getLike() {
        return like;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKorName(String korName) {
        this.korName = korName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLike(int like) {
        this.like = like;
    }

    private int id;
    private String korName;
    private String engName;
    private String image;
    private int price;
    private int like;

}
