# Q1. Apply Bonus using Higher-Order Function

def apply_bonus(func, salary):
    # func is a function that applies some bonus
    return func(salary)

def festival_bonus(salary):
    return salary + 5000

def performance_bonus(salary):
    return salary * 1.10  # 10% bonus

# Example usage
if __name__ == "__main__":
    updated_salary = apply_bonus(performance_bonus, 50000)
    print("Updated Salary (Performance Bonus):", updated_salary)
    updated_salary = apply_bonus(festival_bonus, 50000)
    print("Updated Salary (Festival Bonus):", updated_salary)
