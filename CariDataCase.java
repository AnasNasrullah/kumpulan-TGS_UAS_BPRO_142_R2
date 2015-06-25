import java.io.*;

public class CariDataCase
{

public static String []nimList = {"12410100213",
"12410100233",
"13410100002",
"13410100019",
"13410100020",
"13410100021",
"13410100028",
"13410100046",
"13410100054",
"13410100064",
"13410100074",
"13410100111",
"13410100121",
"13410100145",
"13410100147",
"13410100148",
"13410100154",
"13410100156",
"13410100158",
"13410100160",
"13410100161",
"13410100163",
"13410100170",
"13410100176",
"13410100186",
"13410100203",
"13410100212",
"13410100223",
"13410100227",
"13410100235",
"13410100239"};
public static String []namaList={
"Rudi Tri Setiawan",
"Nugraha Caturriyanto Utama",
"Bagus Rahmadan",
"Irfan Listyo Pamungkas",
"Umar",
"Bagas Ferry Pradityo",
"Iman Nurbela",
"Flavianus Yoga Perdana",
"Risky Fitri Islamiati",
"Achmad Misbahuddin Alharits",
"Muchammad Ainul Chakim",
"Bagus Handoko",
"Adhi Setiawan",
"Belly Purna Bahesa",
"Satria Wina Adhiguna",
"Ahmad Aditiya",
"Arizal Azhfahani",
"Teghar Firmansyah",
"Muchamad Nasrullah",
"Moh. Miftahussalam",
"Fammy Ibnu Pribadi",
"Ryan Gusti Erlangga",
"Wildan Bimantoro",
"Dhimas Sulistyo Basuki",
"M. Ali Fikri",
"Aditya Putra Setiajie",
"Farid Denianto",
"Zainudin Adi Kusuma",
"Imas Setiawan Raharja",
"Riyo Tata Hubang",
"Ahmad Faris"};

public static int cariNimIdx(String nim){
//tuliskan algoritma anda di sini
int i=0;
while(i<nimList.length)
	{
		if (nimList[i].toLowerCase().equals(nim.toLowerCase()))
			return i;
			i++;
	}
return -1;
}

public static int cariNamaIdx(String nama){
//tuliskan algoritma anda di sini
	int k=0;
		while(k<namaList.length)
		{
			if(namaList[k].equals(nama))
				return k;
				k++;
		}
return -1;
}

public static String cariDataMhs(String nim){
//tuliskan algoritma anda di sini
int idx=cariNimIdx(nim);
	if(idx==-1)
	return "DATA TIDAK DITEMUKAN";
	else
	return namaList[idx];
}


public static String cariNama(String nama1){
int counter=0;
					for(int i=0;i<namaList.length;i++)
					{
						if(namaList[i].toLowerCase().contains(nama1.toLowerCase()))
						{
							System.out.println(namaList[i]+" ");
							counter=1;
						}
					}

	return (" ");
}




	public static void main (String []args) throws IOException 
	{ BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		boolean Selesai = false;

		int pil = 0;
		
		do 
		{
			
			System.out.println("==============================");
			System.out.println(" cari data mhs");
			System.out.println("1. cari data mhs dari NIM");
			System.out.println ("2. Penyaringan Nama Mahasiswa");
			System.out.println ("3. EXIT");
			System.out.println("==============================");	
			System.out.print ("Pilih pilihan [1-3] : ");
			
			pil = Integer.parseInt(br.readLine());
			System.out.println();
			
			
		
				switch(pil)
				{
					case 1:
					System.out.println();
					System.out.println("======================");
					System.out.println("cari data mhs dari NIM");
					System.out.println("======================");
					System.out.println("Masukan Nim yang ingin dicari :");
					String nim = br.readLine();
					System.out.println("Hasil :"+cariDataMhs(nim));
					System.out.println("");
					System.out.println("Nim terdapat pada indeks ke- :"+cariNimIdx(nim));
					System.out.println("");
					
					break;
					
					
					
					case 2:
					System.out.println();
					System.out.println("==========================");
					System.out.println("Penyaringan Nama Mahasiswa");
					System.out.println("==========================");
					System.out.print("SILAHKAN MASUKKAN NAMA : ");
					String nama1=br.readLine();
					System.out.println("Hasil :");
					System.out.println(cariNama(nama1));
					System.out.print("");

					
					
					break;
					
					case 3:
						Selesai=true;
					break;
										
				default: break;
			}			
		}
		while(!Selesai);
	}
}