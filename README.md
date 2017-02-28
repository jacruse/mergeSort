# mergeSort
We used the method System.nanoTime() to store the time before the operation, 
    and then run the operation, and finally use the method again store the time 
    after the operation.
    
By subtracting the time before the operation from the time after the operation, 
    we will get the actual runtime of the operation. We wrote a method that will 
    calculate the average time for a batch size of 1000.
    
After running several testcases, we realized that MergeSort has a loglinear 
    runtime.
       
Graphs:

   x1 = the number of elements in the array
   
   y1 = time in nanoseconds

   
   black line: loglinear
   
   red line: linear
   
   green line: quadratic
   
   yellow line: logrithmic
   


By looking at the graph, we can see that our data points matches the best with the graph of loglinear.
