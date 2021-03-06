# mergeSort
We used the method System.nanoTime() to store the time before the operation, 
    and then run the operation, and finally use the method again store the time 
    after the operation. 
    
By subtracting the time before the operation from the time after the operation, 
    we will get the actual runtime of the operation. We wrote a method that will 
    calculate the average time for a batch size of 1000. With these numbers, we 
    were able to plot our own data points and use it to compare our values to
    log, loglinear, quadratic, and linear graphs. 
    
After running several testcases, we realized that MergeSort has a loglinear 
    runtime.
       
Graphs:

   x1 = the number of elements in the array
   
   y1 = time in nanoseconds
   
  ![alt tag](https://github.com/jacruse/mergeSort/blob/master/graphs/table.png)
  
  ![alt tag](https://github.com/jacruse/mergeSort/blob/master/graphs/table1.png)

   
   black line: loglinear
   
   yellow line: linear
   
   blue line: quadratic
   
   green line: logrithmic
   
   ![alt tag](https://github.com/jacruse/mergeSort/blob/master/graphs/bigoh.png)
   
   ![alt tag](https://github.com/jacruse/mergeSort/blob/master/graphs/graph.png)
    
   ![alt tag](https://github.com/jacruse/mergeSort/blob/master/graphs/zoom.png)

 While it is not totally clear whether the graph is linear or loglinear, it is clear that the big oh is definetly not log or quadratic. By looking at the graph, we can see that our data points matches the best with the graph of loglinear.
 
