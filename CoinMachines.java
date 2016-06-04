import java.util.Scanner;

public class CoinMachines {

	public static void main(String[] args) {
		int bucket, timesPlayedSlot1, timesPlayedSlot2, timesPlayedSlot3, count = 1;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter how many quarters does Margarie have in her bucket:");
		bucket = scanner.nextInt();

		System.out.println("How many times has machine 1 been played before Margerie arrived?");
		timesPlayedSlot1 = scanner.nextInt();
		
		System.out.println("How many times has machine 2 been played before Margerie arrived?");
		timesPlayedSlot2 = scanner.nextInt();
		
		System.out.println("How many times has machine 2 been played before Margerie arrived?");
		timesPlayedSlot3 = scanner.nextInt();
		
		while (bucket > 0) {
			if (timesPlayedSlot1 == 34) {
				bucket += 30;
				timesPlayedSlot1 = 0;
				count++;
			} else {
				timesPlayedSlot1++;
				bucket--;
				count++;
			}
			if (timesPlayedSlot2 == 100){
				bucket--;
				bucket += 70;
				timesPlayedSlot2 = 0;
				count++;
			}else {
				timesPlayedSlot2++;
				bucket--;
				count++;
			}
			if (timesPlayedSlot3 == 10){
				bucket--;
				bucket += 9;
				timesPlayedSlot3 = 0;
				count++;
			}else{
				timesPlayedSlot3++;
				bucket--;
				count++;
			}

		}
		System.out.println("Game over! Margarie played " + count + " times.");
	}

}
