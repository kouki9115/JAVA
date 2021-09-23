package lesson;

import java.util.Scanner;

public class lesson01 {
 public static void main(String[] args) {
  Lesson lesson = new Lesson("aaa",1);
  Scanner scanner = new Scanner(System.in);
  
  lesson.println();
 
  System.out.print("年齢に足す数字を入力してください：");
  int i = scanner.nextInt();
  lesson.sum(i);
  
 }
}
