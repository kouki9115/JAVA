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
  int a = 1;
  while(a <= 5) {
   a ++;
  System.out.println(a);
  }
  
  for(int aa=1;aa<=3;aa++) {
	System.out.println("zzz");  
  }
  
  int aaa = 10;
  switch(aaa / 5 ) {
   case 0:
	System.out.println("0");   
    break;
   case 1:
	System.out.println("1");      
    break;
   case 2:
	System.out.println("2");   
	break;
   default:
	System.out.println("xxx");   
	break;
  }
  
  String[] arrays = {"a","b","c"};
   for(String array : arrays) {
    System.out.println(array);	   
   }
   
   System.out.println("数字を入力して下さい");
   int fb = scanner.nextInt();
   sublesson.FizzBuzz(fb);
  } 
}
