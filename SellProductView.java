package view;

import java.util.Random;
import java.util.Scanner;

import dto.Owner;
import service.Service;

public class SellProductView {

    Scanner sc = new Scanner(System.in);
    
    
    public void displaySellProductMenu() {
        System.out.println("장사");
        
        

        int day = 1; // 회차
        int guest = s.openShop(); // 손님수
        int loan = service.Service.getOrder().getDept+service.Service.getOwner().Product.getBuyprice(); // 대출금
        int money = service.Service.getOwner().getMoney(); // 잔액
        int interest = service.Service.TodayDept(); // 대출금 이자
        int num = service.Service.getOrder().getProfit;
        int num1 = service.Service.getOwner().Product.getStock;
        Random r = new Random();
        List<Product> list = service.Service.getList();
        int customers = 0;
       

        
        System.out.println("=========== 일 일 결 산===========\n");
        System.out.println(day + "일차 매출");
        for(int i = 0; i<list.size();i++){
            num = r.nextInt(40);
            service.Service.getOwner().addMoney(customers*list.get(i).getRevenue);
            System.out.printf("1. %s %d개 x %dkh = %5dkh\n",list.get(i).getName,customers,list.get(i).getSellingPrice*num);
        }
       
        System.out.println();

        System.out.println(day + "일차 비용");
        System.out.printf("1.대출금 이자 : %d\n", interest);
        System.out.printf("2.판매금액 : %d\n", num);
        System.out.println();
        System.out.printf("총 매출              +%dkh\n", num);
        System.out.printf("총 지출              -%dkh\n", loan);
        System.out.printf("잔액                %dkh\n", service.Service.getOrder().getMoney);
        System.out.println();

        System.out.println("메인메뉴 돌아가려면 q를 입력해주세요");
        while (true) {
            char select = sc.next().charAt(0);
            if (select == 'q') {
                break;
            } else {
                System.out.println("다시 입력해주세요");
            }
        }
    }
}
