/*

Given an array (or string), the task is to reverse the array/string.
Examples : 
 

Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}*/
public class Reverse_The_Array{
    public static void main(String args[]){
        int[] arr = {1,2,3,4};
        //using the function below,we traverse the array from last element
        //and print in that order 
        printInReverseOrder(arr);
    
        ReverseWholeArray(arr);
        RecursiveReverse(arr,0,arr.length-1);
        for(int i : arr){
            System.out.print(i+ " " );
        }
    }
    static void RecursiveReverse(int[] arr,int low,int high){
        // int low = 0 , high = arr.length-1;
        int temp;
        if(low>=high)
        return;
         temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
         RecursiveReverse(arr,low+1,high-1);
    }
    
    static void printInReverseOrder(int[] arr){
        for(int i = arr.length-1 ; i >=0;  i--){
            System.out.print(arr[i]+ " " );
        }
        System.out.println();
    }
    static void ReverseWholeArray(int[] arr){
        int left = 0, right = arr.length-1;
        /*here we maintain two ptrs left and right which points
        to start and end indexes
        we loop through the array till the condition left<=right
        becomes false, during this we create a temp var to swap values
        of both left and right and then we increment left and decrement right
        by the loop ends array will be revesered*/
        while(left<=right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int i : arr){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}
