# Groovy Null Handling Bug

This repository demonstrates a common issue in Groovy where unexpected null values are returned from methods instead of throwing exceptions.  This can cause silent failures and make debugging more difficult.

## Bug Description

The `myMethod` function in `bug.groovy` demonstrates the problem.  When null values are passed as arguments, the method returns null instead of throwing an exception. This is not always obvious, making debugging more challenging.

## Solution

The solution is to explicitly handle null values, either by throwing an exception or returning a specific value that indicates an error condition. This approach makes error handling more explicit and predictable.

## How to reproduce:

1. Clone this repository.
2. Run `bug.groovy` using a Groovy interpreter.  Notice the silent failure.
3. Examine and run `bugSolution.groovy`. This version explicitly checks for null values and throws an `IllegalArgumentException`. 

This improved error handling makes the code safer and easier to debug.