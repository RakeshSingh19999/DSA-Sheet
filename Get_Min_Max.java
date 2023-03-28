/*Given an array A of size N of integers. Your task is to find the minimum and maximum elements in
the array.

Example 1:

Input:
N = 6
A[] = {3, 2, 1, 56, 10000, 167}
Output:
min = 1, max =  10000
*/
public class Get_Min_Max{
    public static void main(String args[]){
        int[] arr =  {3, 2, 1, 56, 10000, 167};
        //to find the min and max element from array
        //we transverse the whole from start to end
        //we assume the first element to be min and max
        //while we tranverse if we encounter min or max element which overcome 
        //the condition we update the max and min value 
        int min,max;
        min= max = arr[0];
        for(int i = 1 ; i < arr.length; i++){
            if(arr[i]<min){
             min = arr[i];   
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Minimum Element in array is : " +min);
        System.out.println("Maximum Element in array is : "+max);
    }
}



