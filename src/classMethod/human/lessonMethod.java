package classMethod.human;

public class lessonMethod {
	public static void main(String[] args) {
		lesson pon = new lesson();
		System.out.println(pon.name);

		lesson oen = new lesson("aaa", 111);
		System.out.println(oen.name+"は"+oen.num );
	}
}
