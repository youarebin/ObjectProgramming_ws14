
public class Poliymorphism {
	private void f() {
		System.out.println("base class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived po = new Derived();
		po.f();
	}
	class Derived extends Poliymorphism{
		public void f() {
			System.out.println("sub class");
		}
	}

}
