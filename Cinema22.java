/**
 * Cinema22
 */
public class Cinema22 {

    public static void main(String[] args) {
        String[][] Audience = new String[4][2];
            Audience[0][0] = "Amin";
            Audience[0][1] = "Bena";
            Audience[1][0] = "Candra";
            Audience[1][1] = "Dela";
            Audience[2][0] = "Eka";
            Audience[2][1] = "Farhan";
            Audience[3][0] = "Gisel";
            Audience[3][1] = "Hana";
                        
            System.out.println(Audience.length);

            System.out.println(Audience[0].length);

            System.out.println(Audience[1].length);

            System.out.println(Audience[2].length);

            System.out.println(Audience[3].length);

            System.out.println(Audience.length);
            for (int i = 0; i < Audience.length; i++) {
            System.out.println("Panjang baris ke-"+(i+1)+" : "+Audience[i].length);
    }
            for (String[] rowAudience : Audience) {
            System.out.println("Panjang baris :"+rowAudience.length);
    }
            System.out.println("penonton pada baris ke-3: ");

            for (int i = 0; i < Audience[2].length; i++) {
            System.out.println(Audience[2][i]);
    }
            // Audience[0][0] = "Amin";
            // Audience[0][1] = "Bena";
            // Audience[1][0] = "Candra";
            // Audience[1][1] = "Dela";
            // Audience[2][0] = "Eka";
            // Audience[2][1] = "Farhan";
            // Audience[3][0] = "Gisel";

            // System.out.printf("%s \t %s\n",Audience[0][0],Audience[0][1]);
            // System.out.printf("%s \t %s\n",Audience[1][0],Audience[1][1]);
            // System.out.printf("%s \t %s\n",Audience[2][0],Audience[2][1]);
            // System.out.printf("%s \t %s\n",Audience[3][0],Audience[3][1]);

    }
}