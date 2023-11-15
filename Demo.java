abstract class Dog {
	String Color;

	public abstract void move();

	public abstract void call();
}

public class Demo {
	public static void main(String args[]) {
		Dog maomao = new Dog() {
			public void move() {
				System.out.println("��ʼ�ƶ�");
			}

			public void call() {
				System.out.println("���~");
				System.out.println("����");
			}
		};
		maomao.Color = "��ɫ";
		maomao.move();
		maomao.call();
		// tb到此一游
	}
}
