/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai1 {

    Scanner sc = new Scanner(System.in);
    int[] arr;
    int n;

    public static void main(String[] args) {
        bai1 b1 = new bai1();
        b1.input();
        while(true) {
            b1.menu();
            switch(b1.luachon()) {
                case 1 :  {
                    b1.output();
                }
            }
               
            

        }
        
        

        
        
    }
    public void menu() {
        System.out.println("\n");
        System.out.println("================Menu================");
        System.out.println("1.In các phần tử của mảng , ghi rõ nó là số chẵn hay lẽ");
        System.out.println("2.In ra tổng các số chẵn");
        System.out.println("3.In ra tổng các số lẻ");
        System.out.println("4.Liệt kê các số nguyên tố trong mảng");
        System.out.println("5.Tính trung cộng của các phần tử trong mảng");
        System.out.println("6.Tính tổng các số vừa chia hết cho 3 vừa chia hết cho 5 trong mảng");
        System.out.println("7.Tìm vị trí của phần tử có giá trị x được nhập từ bàn phím");
        System.out.println("Nhập lựa chọn của bạn : ");
    }
    public int luachon() {
        
            int luachon = Integer.parseInt(sc.nextLine());
            return luachon;
    }
    public void input() {
        System.out.println("Nhập số lượng phần tử mảng: ");
        n = Integer.parseInt(sc.nextLine());
        arr = new int[n];
        System.out.println("Nhập các phần tử mảng : ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
    }

    
    public void output() {
        for (int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                System.out.println(arr[i] + " so chan ");
            }
            else System.out.println(arr[i] + " so le ");
        }
    }
    
    // in so chan 
    public void inRaCaSoChan() {
        int sum = 0;
        for (int x = 0 ; x < n ; x++) {
            if(arr[x] % 2 == 0) {
                sum += arr[x];
            }
        }
        System.out.println("tong chan : " + sum);
    } 
    
    //in so le 
    public void inRaCaSoLe() {
        int sum = 0;
        for (int x = 0 ; x < n ; x++) {
            if(arr[x] % 2 != 0) {
                sum += arr[x];
            }
        }
        System.out.println("tong le : " + sum);
    } 
    
    //kiem tra so nguyen to 
    public boolean checksoNT(int n) {
        if(n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
            return true;
        
    }
    //in ra cac so nguyen to trong mang 
    public void inRaCacSoNTTrongMang() {
        for (int i = 0; i < arr.length; i++) {
            if(checksoNT(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    
    public void tinhTBC() {
        double sum = 0;
            for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
            System.out.println("Trung binh cong : " + (double)sum/arr.length);
    }
    public void tinhTongSoChiahet3and5() {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 == 0 && arr[i] % 5 ==0){
                sum += arr[i];
            }
        }
        System.out.println("Tong chia het 3 va 5 :  " + sum );
    }

    public void timViTriX() {
        System.out.println("Nhập phần tử cần tìm : " );
        int x = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                System.out.println("vị trí của " + arr[i] + " là : " + i);
                break;
            }
        }
        System.out.println("Khong tim thay gia tri x trong mang ");
    }
}
