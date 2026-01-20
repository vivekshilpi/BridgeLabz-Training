package sorting.gamerzone;

public class PlayerSorting {
	
	public static void quickSort(Player[] playersList, int si, int ei) {
		if(si >= ei) {
			return;
		}
		
		int pIdx = partition(playersList, si, ei);
		quickSort(playersList, si, pIdx-1);
		quickSort(playersList, pIdx+1, ei);
	}
	
	public static int partition(Player[] playersList, int si, int ei) {
		Player pivot = playersList[ei];
		int i = si-1;
		
		for(int j=si; j<ei; j++) {
			if(playersList[j].score < pivot.score) {
				i++;
				Player temp = playersList[i];
				playersList[i] = playersList[j];
				playersList[j] = temp;
			}
		}
		
		i++;
		Player temp = playersList[i];
		playersList[i] = playersList[ei];
		playersList[ei] = temp;
		
		return i;
	}
	
	public static void display(Player[] playersList) {
		for(Player p : playersList) {
			System.out.println("Player name : " + p.name);
			System.out.println("Score : " + p.score);
			System.out.println();
		}
	}
	
}
