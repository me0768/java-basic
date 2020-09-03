package com.kiworkshop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortingHat {
    public void sort() {
        System.out.println("마법사 이름 입력");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        Map<String, String> attrToHouse = new HashMap<>();
        attrToHouse.put("용감한", "그리핀도르");
        attrToHouse.put("훌륭한", "슬리데린");
        attrToHouse.put("지혜로운", "래번클로");
        attrToHouse.put("착한", "후플푸프");

        System.out.println("어떤 사람으로 기억되고싶나요? \n ");
        String userAttr = sc.nextLine();
        String userHouse = attrToHouse.get(userAttr);
        System.out.println(username + "님의 기숙사는 " + userHouse);
    }
}
