/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phan1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;  
        int tong;
        Scanner sc = new Scanner(System.in);
        System.out.print("Cho biet so thu 1:");
        a = sc.nextInt();
        System.out.print("Cho biet so thu 2:");
        b = sc.nextInt();
        
        tong = a+b;
        System.out.println("Tong 2 so :" + tong);
    }
    
}
