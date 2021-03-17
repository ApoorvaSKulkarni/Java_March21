import java.util.Scanner;

public class TrafficLightSimulation {
	public static void main(String[] args) {
		System.out.println("1. Red \n 2.Green \n 3.Yellow");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the light:");
		int light = sc.nextInt();
		switch(light){
			case 1:System.out.println("Stop");
			break;
			case 2:System.out.println("Go");
			break;
			case 3:System.out.println("Ready");
			break;
			default:System.out.println("Not an appropriate input"); 
		}
        
	}
}
