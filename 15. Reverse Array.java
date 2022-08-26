15. How do you reverse an array?
  
  
// 1) Loop till the half-length of the array.
// 2) Replace the numbers corresponding to the indexes from the starting and the end.
  
  
int[] a = { 1, 2, 7, 6, 4, 9, 12 };

for (int t = 0; t < a.length / 2; t++) { 

    int tmp = a[t]; 

    a[t] = a[a.length - t - 1];  // Swapping

    a[a.length - t- 1] = tmp; 

} 
