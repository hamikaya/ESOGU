package denemeler;
import java.util.*;
public class ders_soru_24 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Say� Girin: ");
		int sayi = giris.nextInt();
        String binary = Integer.toBinaryString(sayi);
        System.out.print("Girdi�iniz say�n�n ikilik sistemindeki kar��l���: "+binary);
	}

}
