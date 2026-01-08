package com.sisa;

import java.util.ArrayList;

public class NameMenu {

    // 멤버변수
    private ArrayList<String> names = new ArrayList<>();

    // 1. 추가
    public void addName(String name) {
        if (names.size() >= 5) {
            System.out.println("#더 이상 추가할 수 없습니다.");
            return;
        }

        names.add(name);
        System.out.println("#이름이 추가되었습니다.");
    }

    // 2. 검색 (전체 출력)
    public void search() {
        System.out.println("#이름목록");
        for (String name : names) {
            System.out.println(" " + name);
        }
    }

    // 3. 수정
    public void update(String oldName, String newName) {
        int index = names.indexOf(oldName);

        if (index != -1) {
            names.set(index, newName);
            System.out.println("#이름이 수정되었습니다.");
        } else {
            System.out.println("#해당 이름을 찾을 수 없습니다.");
        }
    }

    // 4. 삭제
    public void delete(String delName) {
        if (names.remove(delName)) {
            System.out.println("#이름이 삭제되었습니다.");
        } else {
            System.out.println("#해당 이름을 찾을 수 없습니다.");
        }
    }
}
