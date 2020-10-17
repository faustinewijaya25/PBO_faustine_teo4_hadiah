import java.util.Scanner;
public class hadiah4teori {
	public static void main (String[] args) {
		Scanner masukan = new Scanner(System.in);
		String nama;
		double nt1,nt2,nt3, rata, akhir, nmid,nfinal;
		
		
		System.out.println("Nilai Huruf dan Nilai Akhir");
		System.out.println(" A       80-100 ");
		System.out.println(" B       60-79 ");
		System.out.println(" C       50-59 ");
		System.out.println(" D       40-49 ");
		System.out.println(" E       < 40 ");
		System.out.print("Masukan Nama = ");
		nama= masukan.nextLine();
		System.out.print("Masukan Nilai Tugas 1 = ");
		nt1= masukan.nextInt();
		System.out.print("Masukan Nilai Tugas 2 = ");
		nt2= masukan.nextInt();
		System.out.print("Masukan Nilai Tugas 3 = ");
		nt3= masukan.nextInt();
		System.out.print("Masukan Nilai Mid = ");
		nmid= masukan.nextInt();
		System.out.print("Masukan Nilai Final = ");
		nfinal= masukan.nextInt();
		rata= (nt1+nt2+nt3)/3;
		akhir= (rata * 0.3) + (nmid * 0.3)+ (nfinal * 0.4);
		
		System.out.println();
		System.out.println("Nama= " +nama);
		System.out.println("Nilai Rata-Rata= " +rata);
		System.out.println("Nilai Akhir= " +akhir);
		
		if ( akhir >=80)
		{
			System.out.println("Nilai Huruf = A");
		}
		else if ( akhir >=60 )
		{
			System.out.println("Nilai Huruf = B ");
		}
		else  if ( akhir >=50 )
		{
			System.out.println("Nilai Huruf = C ");
		}
		else  if ( akhir >=40)
		{
			System.out.println("Nilai Huruf = D");
		}
		else if (akhir <= 40)
		{
			System.out.println("Nilai Huruf = E");
		}
	}
}