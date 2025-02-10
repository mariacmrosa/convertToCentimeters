# Height to Centimeters Converter

This Java project demonstrates how to convert a height given in inches to centimeters.

## Description

The program defines two methods:

*   `convertToCentimeters(int height)`: This method takes a height in inches as an integer (`int`) and returns the equivalent height in centimeters as a floating-point number (`double`). The conversion is done by multiplying the height in inches by 2.54 (1 inch = 2.54 centimeters).

*   `main(String[] args)`: This is the main method of the program. It declares a variable `heightInInches` that stores the height in inches. Then, it calls the `convertToCentimeters` method passing `heightInInches` as an argument and stores the result (the height in centimeters) in the variable `heightInCentimeters`. Finally, it prints to the console the original height in inches and the converted height in centimeters.

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

    The program will print the following output to the console:

    ```
    8 inches is equal to 20.32 centimeters.
    ```

## Example

If you want to convert a different height, just change the value of the `heightInInches` variable in the `main` method and run the program again.

## Notes

*   This program assumes that the height provided as input is in inches.

*   The conversion is done using the conversion factor 1 inch = 2.54 centimeters.

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
