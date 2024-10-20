using System;

class Program
{
    static void Main()
    {
        Console.WriteLine("Hello, world!"); // Print "Hello, world!" to the console
        Console.Write("Please enter your name: ");
        string name = Console.ReadLine(); // Read user input from console
        Console.WriteLine($"Hello, {name}! Welcome to C# programming."); // Print personalized greeting
    }
}
