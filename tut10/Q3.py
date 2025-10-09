# Q3. Operate Function with Extensible Design

def operate(func, a, b):
    # func is a math operation passed as argument
    return func(a, b)

# Example math functions
def add(a, b): return a + b
def sub(a, b): return a - b
def mul(a, b): return a * b
def div(a, b): return a / b if b != 0 else None

# Example usage
if __name__ == "__main__":
    print("Addition:", operate(add, 10, 5))
    print("Subtraction:", operate(sub, 10, 5))
    print("Multiplication:", operate(mul, 10, 5))
    print("Division:", operate(div, 10, 5))
