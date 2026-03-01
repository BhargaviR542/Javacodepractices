class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int size= arr.length; 
        int[] temp= new int[size];
        if (arr.length == 0 || arr.length ==1) {
return;        } else {
                  int k=0;
                  for(int i=0; i < arr.length; i++) {
                    if (arr[i] != 0) {
                       temp[k]=arr[i];
                       k++;
                    }
                  }
               
                  while(k < size) {
                    temp[k++]=0;
                  }
            
for (int i = 0; i < size; i++) {
            arr[i] = temp[i];
        }                

        }
    }
}