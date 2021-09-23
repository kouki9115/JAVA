package lesson;

public class Lesson {
 private String name;
 private int age;
 private int sum = 0;
 
 public Lesson(String name, int age) {
	this.name = name;
	this.age = age;
 }
 
 public String getName() {
	 return this.name;
 }
 
 public int getAge() {
	 return this.age;
 }
 
 public void setName(String name) {
	this.name = name;
 }
 
 public void setAge(int age) {
	this.age = age;
 }
 
 public void println() {
 System.out.println(this.name + "です" + this.age + "歳です");
 }
 
 public void sum(int i) {
  System.out.println(this.age + sum + i);
 }
}
