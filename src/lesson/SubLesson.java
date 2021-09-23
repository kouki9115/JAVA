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
 
}
