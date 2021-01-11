
package uri;

import java.util.Scanner;
public class simple_calculate_1010 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int c_1_p, c_2_p, n_1_p, n_2_p;
        double v_1_p, v_2_p, total;
        c_1_p = sc.nextInt();
        n_1_p = sc.nextInt();
        v_1_p = sc.nextDouble();
        c_2_p = sc.nextInt();
        n_2_p = sc.nextInt();
        v_2_p = sc.nextDouble();
        total = (n_1_p * v_1_p) + (n_2_p * v_2_p); 
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
    
}
