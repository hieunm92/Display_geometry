import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu ");
        System.out.println("1. Ve hinh chu nhat ");
        System.out.println("2. Ve hinh tam giac vuong ");
        System.out.println("3. Ve hinh tam giac can ");
        System.out.println("0. Exit ");
        System.out.println("Nhap hinh muon ve ");
        while (true){
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println(" Ve hinh chu nhat");
                    for (int i = 0; i < 3; i++) {
                        System.out.println("");
                        for(int j = 0; j < 8; j++){
                            System.out.print("*");
                        }

                    }
                    break;

                case 2:
                    for (int i = 7; i >= 1; i--) {
                        System.out.println("");
                        for(int j = 1; j <= i; j++){
                            System.out.print("*");
                        }
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print(" " + " ");
                        }
                        for (int j = 5 - i + 1; j <= 5 + i - 1; j++) {
                            System.out.print("*" + " ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Khong ve");

            }
        }
    }
}
