package Lec13;

public class Container_With_Most_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
	}

	public static int Most_Water(int[] arr) {
		int i=0;
		int j=arr.length-1;
		int ans=0;
		while(i<j) {
			int w=(j-i);
			int h=Math.min(arr[i], arr[j]);
			ans=Math.max(ans,h*w);
			if(arr[i]<arr[j]) {
				i++;
			}
			else {
				j--;
			}
					
		}
		return ans;

	}
}
