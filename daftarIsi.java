public class daftarIsi
{
	
	public static int BAB=1;
	public static String buatDaftarIsi(String judulBab, int halaman) {
			String str="BAB" + BAB + ": " + judulBab;
			for (int i=str.length(); i<20; i++)
				str = str+".";
				str=str+" "+ halaman;
				BAB++;
				return str;
		}	
		
	public static void main (String [] args) {
			String bab1=buatDaftarIsi("pengantar bpro", 2);
			System.out.println(bab1);
			String bab2=buatDaftarIsi("basic java", 22);
			System.out.println(bab2);
			String bab3=buatDaftarIsi("variabel & type data", 30);
			System.out.println(bab3);
		}
		
}
