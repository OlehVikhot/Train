package ua.study;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array [] = {12,123,234,3245,64,645};
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		for(int iter : array){
			System.out.println(iter);
		}
		
		
		
	}

}
