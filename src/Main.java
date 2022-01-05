import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 4, 8, 7, 2, 4, 6, 9, 3, 1};
        Scanner sc = new Scanner(System.in);

        // in ra mảng
        System.out.printf("%-15s","Mảng trước:   ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d   ", arr[i]);
        }

        System.out.print("\nNhập phần tử cần xóa: ");
        int X = sc.nextInt();
        int index = -1;
        for (int i = 0; i< arr.length; i++){
            if (X == arr[i]){
                index = i;
                break;
            }
        }

        if (index == -1){
            System.out.println("Không tìm thấy phần tử trên.");
        } else {
            // thực hiện xóa phần tử
            for (int i = index; i < arr.length -1; i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length -1] = 0;
        }

        // in ra mảng
        System.out.printf("%-15s","Mảng sau:   ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d   ", arr[i]);
        }

    }
}
