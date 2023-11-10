abstract class Dog {
	String Color;

	public abstract void move();

	public abstract void call();
}

public class Demo {
	public static void main(String args[]) {
		Dog maomao = new Dog() {
			public void move() {
				System.out.println("开始移动");
			}

			public void call() {
				System.out.println("嗷呜~");
				System.out.println("喵喵");
			}
		};
		maomao.Color = "灰色";
		maomao.move();
		maomao.call();
	}
}
