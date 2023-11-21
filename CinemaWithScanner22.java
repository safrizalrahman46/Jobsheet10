import java.util.Scanner;

public class CinemaWithScanner22 {
    public static void main(String[] args) {
        Scanner Itings22 = new Scanner(System.in);
            String[][] Audience = new String[4][2];
            int Row, Column;
            String name,next;

            while (true) {
            System.out.print("input name: ");
            name = Itings22.nextLine();
            System.out.print("input Row: ");
            Row = Itings22.nextInt();
            System.out.print("input Column: ");
            Column = Itings22.nextInt();
            Itings22.nextLine();

            Audience[Row-1][Column-1] = name;
            System.out.println("Any other audience (y/n): ");
            next=Itings22.nextLine();
            
            if (next.equalsIgnoreCase("n")) {
            break;
            }
            }
    }
}
