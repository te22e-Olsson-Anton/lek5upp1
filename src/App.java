import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int[] fält1 = new int[5];

        fält1[0] = 8;
        fält1[1] = 4;
        fält1[2] = 6;
        fält1[3] = 3;
        fält1[4] = 9;

        System.out.println(fält1[0]);
        System.out.println(fält1[1]);
        System.out.println(fält1[2]);
        System.out.println(fält1[3]);
        System.out.println(fält1[4]);

        
        System.out.println(fält1.length);

        double medelvärde1 = (fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4])/fält1.length;

        System.out.println(medelvärde1);

        int[] fält2 = new int[5];

        fält2[0] = 18;
        fält2[1] = 14;
        fält2[2] = 16;
        fält2[3] = 13;
        fält2[4] = 19;

        int summa = (fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4]+fält2[0]+fält2[1]+fält2[2]+fält2[3]+fält2[4]);

        System.out.println(summa);

        double medelvärde2 = (fält2[0]+fält2[1]+fält2[2]+fält2[3]+fält2[4])/fält2.length;

        System.out.println(medelvärde2);


        int[] summaFält = new int[5];

        summaFält[0] = fält1[0]+fält2[0];
        summaFält[1] = fält1[1]+fält2[1];
        summaFält[2] = fält1[2]+fält2[2];
        summaFält[3] = fält1[3]+fält2[3];
        summaFält[4] = fält1[4]+fält2[4];

        int[] addition = new int[4];
        
        
        Scanner tb = new Scanner(System.in);
        System.out.println("Skriv tal 1:");
        int tal1 = tb.nextInt();
        System.out.println("Skriv tal 2:");
        int tal2 = tb.nextInt();
        System.out.println("Skriv tal 3:");
        int tal3 = tb.nextInt();
        System.out.println("Skriv tal 4:");
        int tal4 = tb.nextInt();

        addition[0] = tal1;
        addition[1] = tal2;
        addition[2] = tal3;
        addition[3] = tal4;
        
        int addera = (addition[0]+addition[1]+addition[2]+addition[3]);

        System.out.println(addera);

        tb.close();
        
    }
}
