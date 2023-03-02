package dto;

public static class Order {

    private Product product; // 제품
    private int count; // 주문 갯수
    public Order(Product product, int count){
        this.product = product;
        this.count = count;
    }
    
    // 총 수입
    public Product getProduct(){
        return this.product;
    }
}
