import java.util.Scanner;
public class prob2 {
    public static String checkequilibrium (int n,int[] x, int[] y,int[] z) {
        int sumx=0;
        int sumy=0;
        int sumz=0;
        if (n<1 || n>100)
            return "input n out of range";
        else {
            for (int i = 0; i < n; i++) {
                if (x[i] > 100 || x[i] < -100)
                    return "input x" + i + " out of range";
                else sumx += x[i];

                if (y[i] > 100 || y[i] < -100)
                    return "input y" + i + " out of range";
                else sumy += y[i];

                if (z[i] > 100 || z[i] < -100)
                    return "input z" + i + " out of range";
                else sumz += z[i];
            }

            int totalsum = sumx + sumy + sumz;

            if (totalsum == 0)
                return "YES";
            else
                return "NO";
        }
    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] array_x = new int [n];
        int [] array_y = new int [n];
        int [] array_z = new int [n];

        for (int i = 0; i < n; i++)
        {
            int a = input.nextInt();
                array_x[i]= a ;

            int b = input.nextInt();
                array_y[i]= b;

            int c = input.nextInt();
                array_z[i]= c;
        }

        System.out.println( checkequilibrium (n,array_x,array_y,array_z));

    }
}
