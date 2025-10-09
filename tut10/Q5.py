# Q5. Discount Calculator using Closure

def discount_calculator(rate):
    def apply_discount(price):
        discounted = price * (1 - rate)
        return discounted
    return apply_discount

# Example usage
if __name__ == "__main__":
    ten_percent = discount_calculator(0.1)
    price = 2000
    print("Original Price:", price)
    print("Discounted Price (10% off):", ten_percent(price))
