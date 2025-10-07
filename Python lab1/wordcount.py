def count_words(text):
    words = [word for word in text.strip().split() if word]
    count = 0
    for _ in words:
        count += 1
    return count

input_text = "Sum of 12 and 20 is 32"
print("The count of words is:", count_words(input_text)) 
