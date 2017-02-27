# mergeSort

     * We used the method System.nanoTime() to store the time before the operation, and then run the operation, and finally use the method again store the time after the operation.
     * By subtracting the time before the operation from the time after the operation, we will get the actual runtime of the operation. We wrote a method that will calculate the average time for a batch size of 1000.
     * After running several testcases, we realized that MergeSort has a loglinear runtime.
     * n=1       time: 54ns
       n=10      time: 1291ns
       n=100     time: 12460ns
        ...
       n=<huge>  time: nlog2(n)
       
       Graphs:
    ![Alt tag](https://github.com/jacruse/mergeSort/blob/master/graphs/table.png)

