package dto;

public class Product {

    private String name; // 제품명
    private int buyingPrice; // 살 때 가격
    private int sellingPrice; // 팔 때 가격

    public Product(String name, int buyingPrice, int sellingPrice) {
        this.name = name;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    @Override
    public String toString() {
        return name + " / " + buyingPrice + " / " + sellingPrice;
    }

}
