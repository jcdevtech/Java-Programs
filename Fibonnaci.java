//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class Fibonnaci{
    public Fibonnaci() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = input.nextInt();
        int count = 1;
        boolean c = true;
        int b = 1;

        for(int a = 0; count <= n; ++count) {
            int var7 = b + a;
            try{Thread.sleep(90);}
            catch (Exception e){}
            System.out.print(var7 + "\n");
            a = b;
            b = var7;
        }

    }
}
