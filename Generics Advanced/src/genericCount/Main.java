package genericCount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Box<Double> box = new Box<>();
        for (int i = 0; i < n; i++) {
            box.add(Double.parseDouble(scanner.nextLine()));
        }
        Double value = Double.parseDouble(scanner.nextLine());
        box.compare(value);
        System.out.println(box);
    }
}
