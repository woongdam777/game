package service;

import dto.Owner;
import dto.Product;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private static Owner owner;
    private static List<Product> productList = new ArrayList<>(); // 물건 목록

    public Service(String name, String ceo) {
        owner = new Owner(name, ceo);
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

    // 장사 개시
    public static void openShop() {

    }

    // 이자 상환
    public static void repayment(int input) {
    	owner.setDept(owner.getDept() - input);
    }
    
    // 순수익 (매출액 - 매입원가)
    // 매출액 : sellproduct 클래스
    // 매입 원가 : 
    public static void totalrevenue() {
    	
    }
    
    // 프로그램 종료
    public static void exit(int status) {
    	  Runtime.getRuntime().exit(status);
    	}


}
