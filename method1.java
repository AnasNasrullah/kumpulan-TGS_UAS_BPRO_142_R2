public class method1
{
	public static void cetakGaris() {
		for (int i=0; i<50; i++)
			System.out.print("*");
			System.out.println();
		}
		
	public static void cetakGaris( int cetakGaris) {
		for (int i=0; i<cetakGaris; i++)
			System.out.print("*");
			System.out.println();
		}

		public static void main (String [] args) {
		cetakGaris(10);
		System.out.println("1");
		cetakGaris(20);
		System.out.println("2");
		cetakGaris(30);
		System.out.println("3");
		cetakGaris(40);
		System.out.println("4");
		cetakGaris(50);
		System.out.println("5");
	
	}
}