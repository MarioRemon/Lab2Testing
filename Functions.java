public class Functions
{
    public boolean checkEvenOdd(int num)
    {
        if(num % 2 == 0) {
            return true;
        }
        return false;
    }
    public void getMax(int arr[], int length)
    {
        max = arr[0];
        min = arr[0];
        for(int i = 1;  i < length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            else if (arr[i] > min)
            {
                min = arr[i];
            }
        }
    }
}
