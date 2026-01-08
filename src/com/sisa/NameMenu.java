package com.sisa;

public class NameMenu {

	// 멤버변수
	private String[] names = new String[5];

	// 1. 추가
	public void addName(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				names[i] = name;
				System.out.println("#이름이 추가되었습니다.");
				return;
			}
		}
		System.out.println("#더 이상 추가할 수 없습니다.");
	}

	// 2. 검색 (전체 목록)
	public void search() {
		System.out.println("#이름목록");
		for (int i = 0; i < names.length; i++) {
			if (names[i] != null) {
				System.out.println(" " + names[i]);
			}
		}
	}

	// 3. 수정
	public void update(String oldName, String newName) {
	    for (int i = 0; i < names.length; i++) {
	        if (names[i] != null && names[i].equals(oldName)) {
	            names[i] = newName;
	            System.out.println("#이름이 수정되었습니다.");
	            return;
	        }
	    }
	    System.out.println("#해당 이름을 찾을 수 없습니다.");
	}

	// 4. 삭제
	public void delete(String delName) {
		for (int i = 0; i < names.length; i++) {
			if (names[i] != null && names[i].equals(delName)) {
				names[i] = null;
				System.out.println("#이름이 삭제되었습니다.");
				return;
			}
		}
		System.out.println("#해당 이름을 찾을 수 없습니다.");
	}

}
