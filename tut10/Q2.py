# Q2. Filter Students based on Criteria Function

def filter_students(criteria, students):
    # criteria is a function that returns True/False
    return [s for s in students if criteria(s)]

# Example usage
if __name__ == "__main__":
    students = [
        {"name": "Sam", "cgpa": 9.1},
        {"name": "Riya", "cgpa": 7.8},
        {"name": "Amit", "cgpa": 8.5},
    ]
    high_cgpa = filter_students(lambda s: s["cgpa"] > 8, students)
    print("Students with CGPA > 8:")
    for s in high_cgpa:
        print(s)
