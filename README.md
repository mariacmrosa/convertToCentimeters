# Height Converter (Feet and Inches to Centimeters)

This Java project demonstrates how to convert a height given in feet and inches to centimeters using method overloading.

## Description

The program defines two overloaded methods:

*   `convertToCentimeters(int heightInInches)`: This method takes a height in inches as an integer (`int`) and returns the equivalent height in centimeters as a double (`double`). The conversion is done by multiplying the height in inches by 2.54 (1 inch = 2.54 centimeters).

*   `convertToCentimeters(int heightInFeet, int remainingHeightInInches)`: This overloaded method takes a height in feet and the remaining height in inches as integers (`int`). It first converts the height in feet to inches, adds the remaining inches, and then calls the first `convertToCentimeters` method (the one that takes only inches) to perform the final conversion to centimeters.  This demonstrates method overloading by having two methods with the same name but different parameters.

*   `main(String[] args)`: This is the main method of the program. It uses a `Scanner` to get user input for the height in feet and the remaining height in inches. It then calls the overloaded `convertToCentimeters` method (the one that takes feet and inches) to perform the conversion. Finally, it prints the converted height in centimeters to the console.

## How to use

1.  Clone this repository to your local machine.

2.  Make sure you have the Java Development Kit (JDK) installed.

3.  Compile the code using a Java compiler (such as `javac`). For example:

    ```bash
    javac Main.java
    ```

4.  Run the program using the Java Runtime Environment (JRE):

    ```bash
    java Main
    ```

    The program will prompt you to enter the height in feet and then the remaining height in inches. After you provide the input, it will print the converted height in centimeters.  Example interaction:

    ```
    Enter height in feet (a round value): 
    5
    Now enter the remaining value of height in inches: 
    7
    Converted height: 169.92
    ```

## Example

To convert a different height, simply run the program again and enter the new values when prompted.

## Notes

*   This program assumes that the height is provided in feet and inches.

*   The conversion is done using the conversion factor 1 inch = 2.54 centimeters.

*   This example demonstrates method overloading in Java.

## Contributions

Contributions are welcome! Feel free to open issues and pull requests.

## License

This project is under the MIT license.

The MIT License (MIT)

Copyright (c) [2025] [Maria Rosa]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
