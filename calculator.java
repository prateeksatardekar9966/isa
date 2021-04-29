package isa2;


import java.util.Scanner;
public class calculator {
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char option;
      Scanner read = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      num1 = read.nextDouble();
      num2 = read.nextDouble();
      System.out.print("\nEnter operation to be performed (+, -, *) ");
      option = read.next().charAt(0);
      switch(option) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         
      default: System.out.printf(" Enter correct operator");
         return;
      }
      System.out.print("\nThe result is :\n");
      System.out.printf(num1 + " " + option + " " + num2 + " = " + ans);
   }
}