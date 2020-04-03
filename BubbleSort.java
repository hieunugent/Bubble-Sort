class BubbleSort {
  public static int[] bubbleSort(int[] array) {
    // Write your code here.
		if(array.length == 0){
			return new int[]{};
		}
    return bubbleSort(array, false);
  }
	public static int[] bubbleSort(int[] array, boolean isSorted){
		int count = 0;
		while (!isSorted){
			isSorted = true;
			for(int i = 0; i < array.length - 1 - count; i++){
				if (array[i] > array[i+1]){
					swapping(i, i+1, array);
					isSorted  = false;
				}
			}
			count++;
		}
		return array;
	}
	public static void swapping(int i , int j, int[] array){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
