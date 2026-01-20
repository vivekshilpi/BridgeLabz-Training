package sorting.foodfest;

public class StallSorting {
	
	public static void mergeSort(Stall[] stallList, int si, int ei) {
		
		if(si>=ei) {
			return;
		}
		
		int mid = (si+ei)/2;
		
		mergeSort(stallList, si, mid);
		mergeSort(stallList, mid+1, ei);
		
		merge(stallList, si, mid, ei);
	}
	
	public static void merge(Stall[] stallList, int si, int mid, int ei) {
		int i = si;
		int j = mid+1;
		int k = 0;
		Stall[] temp = new Stall[ei-si+1];
		
		while(i<=mid && j<=ei) {
			if(stallList[i].count <= stallList[j].count) {
				temp[k++] = stallList[i++];
			}
			else {
				temp[k++] = stallList[j++];
			}
		}
		
		while(i<=mid ) {
				temp[k++] = stallList[i++];
		}
		
		while(j<=ei) {
				temp[k++] = stallList[j++];
		}
		
		for (int idx = 0; idx < temp.length; idx++) {
			//Use si + idx because the temporary array represents only a subrange of the original array, and copying must start from the original subarray’s starting index.
		    stallList[si + idx] = temp[idx];
		}
		
	}
	
	public static void display(Stall[] stallList) {
		for(Stall s : stallList) {
			System.out.println("Stall name : " + s.stallName);
			System.out.println("FootFall : " + s.count);
			System.out.println();
		}
	}

}
