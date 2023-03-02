package dto;

public class Product {

    private String name; // 제품명
    private int buyingPrice; // 살 때 가격
    private int sellingPrice; // 팔 때 가격
    private int totalRevenue; // 순수익 곱하기전

    public Product(String name, int buyingPrice, int sellingPrice) {
        this.name = name;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }
    public int getRevenue(){
        return sellingPrice-buyingPrice;
    }
    public int getBuyprice(){
        return this.buyingPrice;
    }
    public int getSellingPrice(){
        return this.sellingPrice;
    }
    

    @Override
    public String toString() {
        return name + " / " + buyingPrice + " / " + sellingPrice;
    }

}
