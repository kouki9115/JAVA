package lesson;

import java.util.Scanner;

public class lesson01 {
 public static void main(String[] args) {
  Lesson lesson = new Lesson("aaa",1);
  lesson.println();
  
  SubLesson sublesson = new SubLesson("bbb",2);
  sublesson.println();
  
  
  Scanner scanner = new Scanner(System.in);
  
  System.out.print("年齢に足す数字を入力してください：");
  int i = scanner.nextInt();
  if(i<100) {
  lesson.sum(i);
  }else{
   System.out.println("数字が多きすぎます");	  
  }  
  

  
 }
}
