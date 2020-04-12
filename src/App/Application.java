package App;


public class Application {

	public static void main(String[] args) {
		long s = System.nanoTime();
		long ss = System.currentTimeMillis();
		System.out.println(IntegerToBinary.getBinaryNumber(47));
		long e = System.nanoTime();
		long ee = System.currentTimeMillis();
		System.out.println((e-s)/1000000);
		System.out.println(ee-ss);
	}
	
}
