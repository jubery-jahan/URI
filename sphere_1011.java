
package uri;
import java.util.Scanner;

public class sphere_1011 {
    public static void main(String[] args) {
		
		double a, value;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		value=(4 * 3.14159 * Math.pow(a, 3.0)) / 3;
		System.out.printf("VOLUME = %.3f\n",value );
		

    }
}
