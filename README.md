# Bubble-Sort
- write a function that take in an array of integers and returns a sorted version of that array
- swapping the adjacent and if they are in wrong order, move the number in process until meet the larger one.
# Solution
- swap function
  - save the first value in temp
  - move second value to the first
  - move the temp value to second
- call helper Bubble-Sort 
  - while not end array
  - do the swapping
  - if the swapping is not make return the array
  - if there is a swapping occurred do in a bubble sorted again
