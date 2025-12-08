package main;

public class Main{

	public void sort(int[] A) {
        if (A == null || A.length == 0) {
            return;
        }
        quickSort(A, 0, A.length - 1);
    }

    private void quickSort(int[] A, int low, int high) {
        if (low < high) {
           
            int pivotIndex = partition(A, low, high);         
            quickSort(A, low, pivotIndex - 1); // Left sub-array
            quickSort(A, pivotIndex + 1, high); // Right sub-array
        }
    }

    private int partition(int[] A, int low, int high) {
        
        int pivot = A[high];
        int i = (low - 1); 

        for (int j = low; j < high; j++) {
           
            if (A[j] <= pivot) {
                
            	i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }

        int temp = A[i + 1];
        A[i + 1] = A[high];
        A[high] = temp;

        return i + 1;
    }
	public static void main(String[] args) {
		int[] Test = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 
				26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 
				51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 
				76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
		Main sorter = new Main();
		sorter.sort(Test);
		System.out.println(java.util.Arrays.toString(Test));
		
	}

}
