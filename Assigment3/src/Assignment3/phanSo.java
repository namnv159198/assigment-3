/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import java.util.Scanner;

/**
 *
 * @author namku
 */
public class phanSo {
    private int tu;
    private int mau;

    public phanSo() {
    }
    
    
    public phanSo(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
    }
    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    phanSo nhapPhanSo(int x) {
        int tu,mau;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Nhập phân số thứ " +x );
            tu = in.nextInt();
            System.out.println("-");
            mau = in.nextInt();
            if (mau == 0 ) System.out.println("Mẫu số không thể bằng 0 ! Hãy nhập lại");
            } while (mau == 0);
           
            phanSo ps = new phanSo(tu, mau);
            return ps;
    }
    public void inPhanSo(phanSo ps){
        System.out.print(ps.tu + " / " + ps.mau);
    }
    public int UCLN(int a, int b){
        while ( b!= 0) {            
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
   phanSo rutGon(phanSo ps){
    phanSo p = new phanSo();
    int i = UCLN(ps.tu, ps.mau);
    p.tu = ps.tu / i;
    p.mau = ps.mau / i;
    return p;
    }
   public  void nghichDao(phanSo ps){
        phanSo p = new phanSo();
        p.tu =  ps.mau;
        p.mau = ps.tu;
        if(p.tu % p.mau == 0 )System.out.println(p.tu);
        else System.out.println(p.tu + " / " + p.mau);
    }
    public void  add(phanSo ps){
    int a = (this.getTu() * ps.getMau()) + (ps.getTu() * this.getMau());
    int b = this.getMau() * ps.getMau();
    phanSo k = new  phanSo(a,b);
    k = k.rutGon(k);
    if(k.mau < 0){
        k.tu = k.tu * -1;
        k.mau = k.mau* -1;
    }
    System.out.println(k.tu + " / " +k.mau);
    }
    
    public void  sub(phanSo ps){
    int a = (this.getTu() * ps.getMau()) - (ps.getTu() * this.getMau());
    int b = this.getMau() * ps.getMau();
    phanSo k = new  phanSo(a,b);
    k = k.rutGon(k);
    if(k.mau < 0){
        k.tu = k.tu * -1;
        k.mau = k.mau* -1;
    } 
    System.out.println(k.tu + " / " +k.mau);
    }
    
    public void  mul(phanSo ps){
    int a = this.getTu() * ps.getTu();
    int b = this.getMau() * ps.getMau();
    phanSo k = new  phanSo(a,b);
    k = k.rutGon(k);
    if(k.mau < 0){
        k.tu = k.tu * -1;
        k.mau = k.mau* -1;
    }
    System.out.println(k.tu + " / " +k.mau);
    }
    
    public void  div(phanSo ps){
    int a = this.getTu() * ps.getMau();
    int b = this.getMau() * ps.getTu();
    phanSo k = new  phanSo(a,b);
    k = k.rutGon(k);
    if(k.mau < 0){
        k.tu = k.tu * -1;
        k.mau = k.mau* -1;
    }
    System.out.println(k.tu + " / " +k.mau);
    }
    
    
    
    public static void main(String[] args) {
        phanSo ps = new phanSo();
        phanSo ps2 = new phanSo();
        ps = ps.nhapPhanSo(1);
        ps2 = ps2.nhapPhanSo(2);
        System.out.println("Phan so 1 : ");
        ps.inPhanSo(ps);
        System.out.println("\nPhan so 2 : ");
        ps2.inPhanSo(ps2);
        if (ps.tu !=0) {
             ps = ps.rutGon(ps);
             System.out.println("\nRút gọn phân số 1 : ");
            ps.inPhanSo(ps);
            System.out.println("\nNghịch đảo phân số 1 : ");
            ps.nghichDao(ps);
        }
        if (ps2.tu !=0) {
             ps2 = ps.rutGon(ps2);
             System.out.println("\nRút gọn phân số 2 :  ");
            ps2.inPhanSo(ps2);
            System.out.println("\nNghịch đảo phân số 2 : " );
            ps2.nghichDao(ps2);
        }
        System.out.println("\nTổng hai phân số : ");
        ps.inPhanSo(ps); System.out.print(" + "); ps2.inPhanSo(ps2); System.out.print(" = "); ps.add(ps2);
        System.out.println("\nHiệu hai phân số : ");
        ps.inPhanSo(ps); System.out.print(" - "); ps2.inPhanSo(ps2); System.out.print(" = "); ps.sub(ps2);
        System.out.println("\nTích hai phân số : ");
        ps.inPhanSo(ps); System.out.print(" x "); ps2.inPhanSo(ps2); System.out.print(" = "); ps.mul(ps2);
        System.out.println("\nThương hai phân số : ");
        ps.inPhanSo(ps); System.out.print(" : "); ps2.inPhanSo(ps2); System.out.print(" = "); ps.div(ps2);
    }

    
    
}
