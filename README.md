# US Grading System

## Overview
The US Grading System application allows users to input a numerical grade and receive the corresponding letter grade based on standard grading scales used in the United States. The application supports grades ranging from 0 to 100 and provides appropriate feedback for invalid inputs.

## Features
- Converts numerical grades to letter grades (A+, A, A−, B+, B, B−, C+, C, C−, D+, D, D−, F).
- Validates the input to ensure it falls within the acceptable range (0 to 100).
- User-friendly command-line interface for grade input and output.

## How It Works
The program prompts the user to enter a numerical grade, checks if the input is valid, and then converts that grade to a letter grade using predefined thresholds.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher installed on your machine.

### Running the Application
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/HChristopherNaoyuki/us-grading-system-demo.git
   ```
2. **Navigate to the Project Directory:**
   ```bash
   cd us-grading-system
   ```
3. **Compile the Java File:**
   ```bash
   javac USGradingSystem.java
   ```
4. **Run the Application:**
   ```bash
   java USGradingSystem
   ```

### Example Usage
- When prompted, enter a numerical grade:
  ```
  Enter your numerical grade: 85
  Your letter grade is: B
  ```

## Code Explanation
- The `getLetterGrade(double grade)` method takes a numerical grade as input and returns the corresponding letter grade. It includes validation to ensure the grade is within the valid range.
- The `main` method handles user interaction, reading the input and displaying the output.

## Contribution
Contributions are welcome! If you'd like to enhance this application or fix any bugs, please follow these steps:
1. Fork the repository.
2. Create a new branch (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Open a pull request.
