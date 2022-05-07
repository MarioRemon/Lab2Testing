public class Fun {
    public boolean checkEvenOdd(int num)
    {
        if(num % 2 == 0) {
                return true;
            }
            return false;
        }
        public int[] getMax(int arr[], int length) {
            int max, min;
            int [] arr1= new int[2];
            arr1[0] = arr[0];
            arr1[1] = arr[0];
            for (int i = 1; i < length; i++) {
                if (arr[i] > arr1[0]) {
                    arr1[0] = arr[i];
                } else if (arr[i] > arr1[1]) {
                     arr1[1]= arr[i];
                }
            }
            return arr1;
        }
}
