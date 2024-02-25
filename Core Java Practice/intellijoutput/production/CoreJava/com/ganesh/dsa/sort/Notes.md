# Selection Sort
- We will find element with minimum index, swap it with first element.
- Again we will find min from 2nd to nth element swap it to second place.
- And so on.

# Insertion Sort

InsertionSort(arr)
1. for i = 1 to length(arr) - 1
2.     key = arr[i]
3.     j = i - 1
4.     while j >= 0 and arr[j] > key
5.         arr[j + 1] = arr[j]
6.         j = j - 1
7.     arr[j + 1] = key

For almost sorted array insertion sort is fastest.

- Bubble, Selection and Insertion Sort all have O(n*n) time complexity.
- All have O(1) space complexity; ALl three of them do not create additional copies of the array. They sort the array in place.
- Insertion sort is O(n) when you start with sorted(or almost sorted) data.


