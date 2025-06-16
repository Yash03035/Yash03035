package Aarthi;

public class LogTimeExample {
	public static void main(String[]args) {
		int[]numbers= {1,3,5,7,9,11,13};
		int target=7;
		int low=0;
		int high=numbers.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(numbers[mid]==target) {
				System.out.println("Found number"+target+"at position"+mid);
				return;
			}
			else if(numbers[mid]<target){
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		System.out.println("Number not found.");
	}

}
