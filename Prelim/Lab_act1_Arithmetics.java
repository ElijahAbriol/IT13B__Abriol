package Prelim;


import java.util.Scanner;

public class Lab_act1_Arithmetics {

    public static void main(String[] args) {
        int x;
        int y;
        int z;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first Number: ");
        x = in.nextInt();
        System.out.println("Enter the second Number: ");
        y = in.nextInt();
        System.out.println("Enter the third Number: ");
        z = in.nextInt();

        System.out.println(x + " * " + y + " + " + z + " = " + (x * y + z));
        System.out.println("(" + x + " - " + y + " ) " + " % " + z + " = " + ((x - y) % z));
        System.out.println("(" + x + " + " + y + " + " + z + ")" + " / " + " 3 " + " = " + ((x + y + z) / 3));
        System.out.println(x + " * " + z + " - " + "(" + y + " * " + y + ")" + " = " + (x * z - (y * y)));
    }
}
