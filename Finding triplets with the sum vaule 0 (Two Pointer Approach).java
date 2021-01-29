/*Given an array of integers. Check whether it contains a triplet that sums up to zero. 

Example 1:

Input: N = 5, arr[] = {0, -1, 2, -3, 1}
Output: true
Explanation: 0, -1 and 1 forms a triplet
with sum equal to 0.

Example 2:

Input: N = 3, arr[] = {1, 2, 3}
Output: false
Explanation: No triplet with zero sum exists. 


Your Task:
You don't need to read input or print anything. Your task is to complete the boolean function findTriplets() which takes the array arr[] and the size of the array (n) as inputs and returns True if the given array has a triplet with zero sum and False otherwise. 

Expected Time Complexity: O(N2)
Expected Auxiliary Space: O(1)*/


//The link for the question : https://practice.geeksforgeeks.org/problems/find-triplets-with-zero-sum


//Code for the following

//
 class Triplet
{
    // Function to check if triplet is present 
    // arr[]: input array
    // n: size of the array
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
         Arrays.sort(arr);
         	//Sorting is necessary over here
         	//Always use two pointer approach when the array is sorted Or have to sort
        	//putting length-2 becaus the value is i < j in find sum
        	//we gonna find the value in reverse way according to target 
        for(int i=0;i<n -2;i++)
        {
            if(findSum(arr,-arr[i],i+1)) return true;
        }
        return false;
        
    }
    //first of all lets find sum of two values // using two pointer
    
    
    public boolean findSum(int a[],int value,int i)
    {
        int j=a.length -1;
       //Applied two pointer concept over here 
        while(i<j)
        {
            if(a[i]+a[j] < value)
            {
                i++;
		    //if the summation of the array value is lesser than the target then increment the value of i.
            }
            else if(a[i]+a[j]>value)
            {
                j--;  //if the summation of the array value is greater than the target then decrement the value of j.
            }
            else
            {
                return true;
            }
        }
        return false;
        
    }
    
    
}
