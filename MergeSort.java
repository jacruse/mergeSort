/*
  Team Token: Xin Yi Chen, Melanie Chow, Jack Cruse
  APCS2 pd4
  HW07 -- What Does the Data Say?  
  2017-02-14
 */

/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm: MergeSort sorts an array recursively. If the array has one or less element, then it would just return the array. Otherwise, it would divide the array into 2 sub-arrays, each with halve of the elements of the original array. The sub-arrays will then go through the same process. If each of the sub-array has only one or less elements, it returns the array and merge and sort the two sub-arrays. If more than one element, each sub-arrays will divide into another 2 sub-arrays. It will continue on, until the whole array is sorted.

  ======================================*/

public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) 
    {
	int[] combine = new int[a.length + b.length];
	int aindex = 0;
	int bindex = 0;
	for (int i = 0; i < (a.length + b.length); i++){
	    if (aindex >= a.length){
		combine[i] = b[bindex];
	        bindex++;
	    }
	    else if (bindex >= b.length || a[aindex] <= b[bindex]){
		combine[i] = a[aindex];
		aindex ++;
	    }
	    else{
		combine[i] = b[bindex];
		bindex++;
	    }
	}
	return combine;
    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) 
    {
	//if dataset is 1 element, then dataset is sorted
	if ( arr.length <= 1 ) 
	    return arr;

	//else, halve dataset and recurse on each half
	int leftLen = arr.length / 2;
	int[] leftHalf = new int[ leftLen ];
	int[] rightHalf = new int[ arr.length - leftLen ];

	for( int i=0; i<arr.length; i++ ) {
	    if ( i < leftLen )
		leftHalf[i] = arr[i];
	    else
		rightHalf[ i-leftLen ] = arr[i];
	}

	return merge( sort(leftHalf), sort(rightHalf) );
    }//end sort()
    


    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	String array = "";
	for( int i : a )
	    array += i + ",";
	array = array.substring(0,array.length()-1);	
	System.out.println(array + "]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {


	int[] arr0 = {0};
	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};

	System.out.println("\nTesting mess-with-array method...");
	printArray( arr3 );
	mess(arr3);
	printArray( arr3 );

	System.out.println("\nMerging arr1 and arr0: ");
	printArray( merge(arr1,arr0) );

	System.out.println("\nMerging arr3 and arr4: ");
	printArray( merge(arr3,arr4) ); //error: before was arr4&6 but 6 is not in ascending order
	
	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr4 ) );
	printArray( sort( arr5 ) );
	printArray( sort( arr6 ) ); //[0,9,17,23,42,63,512]
	printArray( sort( arr7 ) ); //[0,9,9,9,17,23,42,63,512]
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class MergeSort

