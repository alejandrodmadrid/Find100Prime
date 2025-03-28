# Prime Number Explorer 🔢✨

A lightweight Java program that discovers prime numbers while teaching core programming concepts. Watch as it identifies the first 100 prime numbers with clear visual feedback!

## 🚀 Features

- **Educational Focus**: Perfect for learning Java fundamentals
- **Real-time Feedback**: Shows primality checks for every number
- **Transparent Process**: Demonstrates each step in the verification process
- **Clean Stopping Point**: Automatically completes after finding the 100th prime

## 🧮 How It Works

1. **Starts counting** from 2 (the first prime number)  
2. **Checks each number** for primality by testing possible divisors  
3. **Prints results** for every number examined:  
   - ✅ Prime numbers get special recognition  
   - ❌ Non-primes show their smallest divisor  
4. **Celebrates completion** when reaching the 100th prime (541)

## 💡 Learning Objectives

This program demonstrates:
```java
// Loop structures
while (primeCount < 100) { ... }
for (int divisor = 2; divisor < currentNumber; divisor++) { ... }

// Flow control
break;    // Exit loops early
continue; // Skip iterations

// Boolean logic
if (currentNumber % divisor == 0) { ... }

// Conditional operations
isPrime ? "✓ PRIME!" : "× NOT prime"
