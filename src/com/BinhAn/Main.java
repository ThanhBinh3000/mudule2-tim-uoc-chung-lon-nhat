package com.BinhAn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số a");
        a = sc.nextInt();
        System.out.println("nhập số b");
        b = sc.nextInt();
        a = Math.abs(a);//Các Math.abs()hàm trả về giá trị tuyệt đối của một số. Nghĩa là, nó trả về xnếu x là dương hoặc 0, và phủ định của xnếu xlà âm.
        b = Math.abs(b);
        if (a==0 || b==0){
            System.out.println("không có ước chung lớn nhất");
        }
        while (a!=b){
            if (a>b){
                a=a-b;
            }else {
                b=b-a;
            }
        }
        System.out.println("ước chung lớn nhất "+a);

    }
}
