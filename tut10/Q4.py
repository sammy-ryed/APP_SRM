# Q4. Student Profile using Nested Function

def student_profile(name):
    marks = {}

    def add_marks(subject, mark):
        marks[subject] = mark
        avg = sum(marks.values()) / len(marks)
        print(f"Updated marks for {name}: {marks}")
        print(f"Average: {avg:.2f}")
        return avg

    return add_marks

# Example usage
if __name__ == "__main__":
    profile = student_profile("Sammy")
    profile("Math", 90)
    profile("Science", 85)
    profile("English", 88)
