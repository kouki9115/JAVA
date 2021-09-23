package lesson;

public class SubLesson extends Lesson {
 
	public SubLesson(String name,int age) {
		super(name,age);
	}
	private String play = "ponpon";
 
 public String getPlay() {
	return this.play;
 }
 
 public void println() {
  super.println();
  System.out.println(this.getPlay());
 }
 
 public void FizzBuzz(int fb) {

  if(fb % 15 == 0) {
   System.out.println("FizzBuzz");
  }else if(fb % 5 == 0) {
   System.out.println("Fizz"); 
  }else if(fb % 3 == 0) {
   System.out.println("Buzz"); 
  }else {
   System.out.println(fb);	 
  }
 }
}
