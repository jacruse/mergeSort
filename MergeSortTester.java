/*
  Team Token: Xin Yi Chen, Melanie Chow, Jack
  APCS2 pd4
  HW07 -- What Does the Data Say?  
  2017-02-14
 */

/*======================================
  class MergeSortTester

  ALGORITHM:
  We used System.nanoTime() to store the time before and after the operation. Then we use these data to calculate the average runtime of the operation for different array sizes to find the Big-Oh of MergeSort.

  BIG-OH CLASSIFICATION OF ALGORITHM:
  Loglinear

  Mean execution times for dataset of size n:
  Batch size: 1000 <# of times each dataset size was run>
  n=1       time: 54ns
  n=10      time: 1291ns
  n=100     time: 12460ns
  ...
  n=<huge>  time: infinite

  ANALYSIS:
  The pattern seem to be ~54nlog2(n) -> a constant about 54 times the number of elements and times the log base 2 of the number of elements. The results fits the pattern of a loglinear runtime.
  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * We used the method System.nanoTime() to calculate the execution time.
     * We store the time before the operation, and then run the operation, and finally store the time after the operation.
     * By subtracting the time before the operation from the time after the operation, we will get the actual runtime of the operation. 
     * After running several testcases, we realized the pattern and that MergeSort has a loglinear runtime.  
     ******************************/
    
    public static long time(int[] arr){
	//	MergeSort.printArray(arr);
	long before = System.nanoTime();
	//	MergeSort.printArray(MergeSort.sort(arr));
	MergeSort.sort(arr);
	long after = System.nanoTime();
	return after-before;
    }
    
    public static int[] popArray(int n){
	int[] arr = new int[n];
	for(int i = 0; i < n; i++){
	    arr[i] = (int)(Math.random()*1000);
	}
	return arr;
    }

    //average time
    public static String meanTime(int[] a){
	long total= 0;
	for (int i = 0; i < 1000; i++){
	    total += time(a);
	}
	total = total / 1000;
	String message = a.length + " elements: " + total;
	return message;
    }
    
    public static void main( String[] args ) 
    {
	//the first testcase always take longer time
	System.out.println("===ignore this line=== " + time(popArray(0)));
	System.out.println(meanTime(popArray(1)));
	System.out.println(meanTime(popArray(10)));
	System.out.println(meanTime(popArray(100)));
	System.out.println(meanTime(popArray(1000)));
	System.out.println(meanTime(popArray(10000)));
    }//end main

}//end class
