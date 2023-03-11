import java.util.Scanner;

public class VKEHesaplama 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Boyunu gir : ");
		double boy = scan.nextDouble();
		System.out.println("Kilonu gir : ");
		double kilo = scan.nextDouble();
		double indeks = kilo / (boy * boy);
		System.out.println("VKI : " + indeks);
	}
}