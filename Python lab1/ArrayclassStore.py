class ArrayStore:
    def __init__(self):
        self.nums = []
 
    def accept_numbers(self):
        for _ in range(10):
            self.nums.append(int(input("Enter number: ")))
 
    def display_while(self):
        i = 0
        while i < len(self.nums):
            print(self.nums[i], end=" ")
            i += 1
        print()
 
    def display_for(self):
        for num in self.nums:
            print(num, end=" ")
        print()
 
    def sort_ascending(self):
        self.nums.sort()
 
    def count_occurrences(self, x):
        return self.nums.count(x)
 
    def insert_at_position(self, num, pos):
        if 0 <= pos <= len(self.nums):
            self.nums.insert(pos, num)
 
    def unique_elements(self):
        return list(set(self.nums))
 
store = ArrayStore()
store.nums = [9, 2, 2, 9, 10, 9, 3, 1, 4, 2]
 
store.display_while()
store.display_for()
store.sort_ascending()
print("Sorted:", store.nums)
print("Count of 9:", store.count_occurrences(9))
store.insert_at_position(5, 2)
print("After Insertion:", store.nums)
print("Unique:", store.unique_elements())