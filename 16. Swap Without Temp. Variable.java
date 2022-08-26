16. How would you swap two numbers without using a third variable?
  
  
// 1) Declare two variables and initialize them with values.
// 2) Make b the sum of both numbers.
// 3) Then subtract the sum (b) from a, so a is now swapped.
// 4) Lastly, subtract a from the sum (b), so b is also swapped.
  
  # SOLUTION (LOGIC):

int a = 10;

int b = 20;

b = b + a; // now b is sum of both the numbers

a = b - a; // b - a = (b + a) - a = b (a is swapped)

b = b - a; // (b + a) - b = a (b is swapped)
