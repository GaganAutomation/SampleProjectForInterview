package interviewQuestion;

public class SameElement {
	
	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5,6};
		int arr2[] = {1,2,3,2,4,5,7};
		
		if(arr1.length==arr2.length) {
			System.out.println("Both have same number of elements");
		}else {
			System.out.println("different number of elements");
		}
		
		
	}

}
