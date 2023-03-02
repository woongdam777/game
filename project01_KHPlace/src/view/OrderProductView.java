package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderProductView {

    private Scanner scanner = new Scanner(System.in);

    public void displayOrderProductMenu() {
        System.out.println("================== 발 주  화 면 ==================");
        System.out.println("  번호    메 뉴\t\t\t\t살 때\t\t팔 때   ");
        System.out.println("================================================");
        // 각 메뉴는 객체로 존재
        // 메뉴가 정해지면 반복문을 이용해서 전체 메뉴 출력
        /*for( int i=0; i<productList.size(); i++ ) {
            System.out.printf("%4d\t%s\t\t\t\t%d kh\t\t%d kh");
        }*/
        System.out.println("   1   아메리카노\t\t\t\t300 kh\t\t500 kh");
        System.out.println("   2   카페라떼\t\t\t\t300 kh\t\t500 kh");
        System.out.println("   3   카푸치노\t\t\t\t300 kh\t\t500 kh");
        System.out.println("   4   베이글\t\t\t\t\t300 kh\t\t500 kh");
        System.out.println("   5   케이크\t\t\t\t\t300 kh\t\t500 kh");
        System.out.println("   6   샌드위치\t\t\t\t300 kh\t\t500 kh");
        System.out.println("================================================");
        System.out.println("이전 화면으로 가시려면 q를 입력해주세요.\n");

//        List<Order> orderList = new ArrayList<Order>();

        while(true) {
            int menu = 0; // 발주할 메뉴
            int count = 0; // 발주할 수량

            // 발주할 메뉴 입력
            System.out.print("메뉴/수량 입력(나가기 q/주문 종료 y) : ");
            String[] inputs = scanner.nextLine().toLowerCase().split("/");
            if (inputs[0].charAt(0) == 'q') return; // 메인메뉴로
            if (inputs[0].charAt(0) == 'y') break; // 주문종료

            try {
                menu = Integer.valueOf(inputs[0]);
                count = Integer.valueOf(inputs[1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("입력 형식을 확인해주세요.(메뉴/수량)\n"); continue;
            } catch (NumberFormatException e) {
                System.out.println("유효하지 않은 입력입니다.\n"); continue;
            }

            // 6 -> 메뉴 전체 크기로 변경
            // MIN_ORDER, MAX_ORDER 선언해서 변경
            if (menu < 1 ||  menu > 6 || count < 1 || count > 200 ) {
                System.out.println("입력 범위 초과\n");
            }

//            orderList.add(new Order(menu, num));
        }

        System.out.println("\n================== 주 문  확 인 ==================");
        System.out.println("  번호    메 뉴\t\t\t\t수량\t\t금액   ");
        System.out.println("================================================");
        // orderList 전체출력
        System.out.println("   1   아메리카노\t\t\t\t2개\t\t500 kh");
        System.out.println("   2   카페라떼\t\t\t\t3개\t\t500 kh");
        System.out.println("   3   카푸치노\t\t\t\t5개\t\t500 kh");
        System.out.println("================================================");
        System.out.println("       합   계\t\t\t\t  \t\t1,500 kh\n");

        char input;
        while(true) {
            System.out.println("주문내용 확정시 y, 추가를 원할 시 n, 메인메뉴로 돌아가려면 q를 입력해주세요.");
            System.out.print("이대로 주문하시겠습니까? : ");
            input = scanner.nextLine().toLowerCase().charAt(0);
            if (input == 'q') return;
            if (input == 'n') /* 발주화면 재출력 */ ;
            if (input == 'y') break;

            System.out.println("유효하지 않은 입력입니다.");
        }

        /* orderList 를 서비스로 넘겨서 발주 진행하기 */;
    }
}
