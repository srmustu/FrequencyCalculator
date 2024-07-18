import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Dizinin boyutunu kullanıcıdan al
        System.out.print("Dizinin boyutu n: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Dizinin elemanlarını kullanıcıdan al
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            array[i] = scanner.nextInt();
        }

        // Elemanların frekanslarını tutmak için HashMap kullan
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Dizideki her elemanın frekansını hesapla
        for (
                int number : array) {
            if (frequencyMap.containsKey(number)) {
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
                frequencyMap.put(number, 1);
            }
        }

        // Sonuçları yazdır
        System.out.println("Tekrar Sayıları:");
        for (
                Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " sayısı " + entry.getValue() + " kere tekrar edildi.");
        }
    }
}


