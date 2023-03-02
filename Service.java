package service;

import dto.Order;
import dto.Owner;
import dto.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Service {

    private static Owner owner;
    private static Order order;

    private static List<Product> productList = new ArrayList<>(); // 물건 목록

    public Service(String name, String ceo) {
        owner = new Owner(name, ceo);
    }
    public Service(){

    }

    public static List<Product> getList(){
        return productList;
    }
    public static Order getOrder(){
        return order;
    }
    public static Owner getOwner() {
        return owner;
    }

    // 이번 턴에 내야하는 이자 계산
    public static int TodayDept() {

        // 구현

        return 0;
    }

    // 물건 구매
    public static void Buying() {

    }

    

    // 중도 상환
    public static void repayment(int input) {

    }


}
