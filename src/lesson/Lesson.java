package lesson;

public class Lesson {
 private String name;
 private int age;
 private int sum = 0;

 public Lesson(String name,int age){
  this.name = name;
  this.age = age;
 }
 
 public String getName() {
	 return this.name;
 }
 
 public int getAge() {
	 return this.age;
 }
 
 
 public void println() {
 System.out.println(this.getName() + "です" + this.getAge() + "歳です");
 }
 
 public void sum(int i) {
  System.out.println(this.age + sum + i);
 }
}
