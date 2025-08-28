import java.util.*;
public class TotalBill {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float pencil = sc.nextFloat();
		float pen = sc.nextFloat();
		float eraser = sc.nextFloat();
		float total = pencil+pen+eraser;
		float withGST = total + (total/100)*18;
		System.out.println(total);
		System.out.print(withGST);
	}
}