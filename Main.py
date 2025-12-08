'''

@author: jacob
'''
import time
class MyClass(object):

    def __init__(self, name):
        self.name = name
        
    def quicksort(self, arr):
    
        if len(arr) <= 1:
            return arr  # @IndentOk
    
        pivot = arr[len(arr) // 2]

        left = [x for x in arr if x < pivot]
        middle = [x for x in arr if x == pivot]
        right = [x for x in arr if x > pivot]

        return self.quicksort(left) + middle + self.quicksort(right)


start_time = time.perf_counter()
test = MyClass("Test") 
arr = [10, 20, 30, 40, 50]
arr2 = test.quicksort(arr)
print(arr2)
end_time = time.perf_counter()
elapsed_time = end_time - start_time
print(f"Elapsed time: {elapsed_time:.7f} seconds")
        