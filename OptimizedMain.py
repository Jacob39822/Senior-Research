'''

@author: jacob
'''
from sorting_techniques import pysort
import time
class MyClass(object):
    
    def __init__(self, name):
        self.name = name
        
start_time = time.perf_counter()
test = pysort.Sorting()
arr = [10, 20, 30, 40, 50]
n = len(arr)
arr2 = test.quickSort(arr, 0, n - 1)
print(arr2)
end_time = time.perf_counter()
elapsed_time = end_time - start_time
print(f"Elapsed time: {elapsed_time:.7f} seconds")
                
        