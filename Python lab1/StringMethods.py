text = "Hello, Python World!"

# Indexing
print(text[7])  

# Membership test
'Python' in text  

# Length
print(len(text))  

# Find
print(text.find('Python'))  

# Equality
print(text == "Hello, Python World!")  

# Case-insensitive equality
print(text.lower() == "hello, python world!".lower())  

# Join
print(' '.join(['Join', 'these', 'words'])) 

# rfind
print(text.rfind('o'))  

# Slicing
print(text[7:13])  

# lower
print(text.lower())  

# upper
print(text.upper())  

# strip
print("   padded string   ".strip()) 
