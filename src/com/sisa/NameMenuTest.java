package com.sisa;

import java.util.Scanner;

public class NameMenuTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NameMenu menu = new NameMenu();

        while (true) {
            System.out.println("\n<이름메뉴>");
            System.out.println("1.추가 2.검색 3.수정 4.삭제 5.종료");
            System.out.print("번호입력 ==> ");
            int choice = sc.nextInt();
            sc.nextLine(); // 버퍼 처리

            switch (choice) {
                case 1:
                    System.out.print("이름입력: ");
                    String name = sc.nextLine();
                    menu.addName(name);
                    break;

                case 2:
                    menu.search();
                    break;

                case 3:
                    System.out.print("기존이름입력: ");
                    String oldName = sc.nextLine();
                    System.out.print("변경이름입력: ");
                    String newName = sc.nextLine();
                    menu.update(oldName, newName);
                    break;

                case 4:
                    System.out.print("삭제이름입력: ");
                    String delName = sc.nextLine();
                    menu.delete(delName);
                    break;

                case 5:
                    System.out.println("-- END --");
                    sc.close();
                    return;

                default:
                    System.out.println("#잘못된 번호입니다.");
            }
        }
    }
}
