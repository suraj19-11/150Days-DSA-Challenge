# Day 5: Recursion Problems

This directory contains Java implementations of various recursion problems, ranging from basic to intermediate level.

## Problems Covered

### 1. Basic Recursion Patterns

#### Print Decreasing Numbers (RecursionBasics.java)
**Problem:** Print numbers from n to 1 in decreasing order.
- **Method:** `PrintDec(int n)`
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

#### Print Increasing Numbers (RecursionBasics.java)
**Problem:** Print numbers from 1 to n in increasing order.
- **Method:** `PrintInc(int n)`
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

---

### 2. Mathematical Problems

#### Factorial (Factorial.java)
**Problem:** Calculate factorial of a number n (n!).
- **Method:** `fact(int n)`
- **Base Case:** n = 0 returns 1
- **Recursive Relation:** n × fact(n-1)
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

#### Sum of Natural Numbers (SumOFNat.java)
**Problem:** Calculate sum of first n natural numbers.
- **Method:** `sum(int n)`
- **Base Case:** n = 1 returns 1
- **Recursive Relation:** n + sum(n-1)
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

#### Power Calculation (Powern.java)
**Problem:** Calculate x^n (x raised to power n).

**Naive Approach:** `power(int x, int n)`
- Repeatedly multiplies x, n times
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

**Optimized Approach (Divide & Conquer):** `Optimizedpower(int x, int n)`
- Uses the identity: x^n = (x^(n/2))^2 for even n
- For odd n: x^n = x × (x^(n/2))^2
- **Time Complexity:** O(log n)
- **Space Complexity:** O(log n)

---

### 3. Array Problems

#### Check if Array is Sorted (Sorted.java)
**Problem:** Check whether an array is sorted in ascending order.
- **Method:** `isSorted(int arr[], int i)`
- Starts from index i=0 and checks if arr[i] ≤ arr[i+1]
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

#### First Occurrence (FirstOccur.java)
**Problem:** Find the first occurrence index of a key in an array.
- **Method:** `FO(int arr[], int key, int i)`
- Traverses from left (i=0) and returns index when key is found
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

#### Last Occurrence (FirstOccur.java)
**Problem:** Find the last occurrence index of a key in an array.

**Method 1 (Backward Traversal):** `LO(int arr[], int key, int i)`
- Traverses from right (i=arr.length-1)
- **Time Complexity:** O(n)

**Method 2 (Forward then Backward):** `SLO(int arr[], int key, int i)`
- Goes to end first, then finds while returning
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

---

### 4. String Problems

#### Remove Duplicates (RemoveDuplicate.java)
**Problem:** Remove duplicate characters from a string, keeping only first occurrence.
- **Method:** `RD(String str, int idx, StringBuilder newStr, boolean map[])`
- Uses a boolean array of size 26 to track seen characters (a-z only)
- **Time Complexity:** O(n)
- **Space Complexity:** O(n) for recursion + O(26) for map

#### Generate Binary Strings (BinaryString.java)
**Problem:** Generate all binary strings of length n without consecutive 1s.
- **Method:** `BS(int n, int lastPlace, String str)`
- `lastPlace` tracks if last placed digit was 0 or 1
- **Time Complexity:** O(2^n) in worst case, but constrained by no consecutive 1s
- **Space Complexity:** O(n) for recursion depth

---

### 5. Combinatorial Problems

#### Tiling Problem (TilingP.java)
**Problem:** Count the number of ways to tile a 2×n board using 2×1 tiles.
- Tiles can be placed vertically (covers 2×1) or horizontally (2×2 arrangement)
- **Method:** `TP(int n)`
- **Base Cases:** n=0 or n=1 → 1 way
- **Recursive Relation:** TP(n) = TP(n-1) + TP(n-2) (Fibonacci pattern)
- **Time Complexity:** O(2^n) without memoization
- **Space Complexity:** O(n)

#### Friends Pairing Problem (FriendsPair.java)
**Problem:** Given n friends, each can either remain single or pair up. Count total ways.
- **Method:** `FP(int n)`
- **Base Cases:** n=1 or n=2 → n ways
- **Recursive Relation:** FP(n) = FP(n-1) + (n-1) × FP(n-2)
  - FP(n-1): nth person remains single
  - (n-1)×FP(n-2): nth person pairs with any of the n-1 others
- **Time Complexity:** O(2^n)
- **Space Complexity:** O(n)

---

### 6. Fibonacci Series (SumOFNat.java)
**Problem:** Calculate nth Fibonacci number.
- **Method:** `fibb(int n)`
- **Base Cases:** n=0 or n=1 returns n
- **Recursive Relation:** fibb(n) = fibb(n-1) + fibb(n-2)
- **Time Complexity:** O(2^n) (exponential)
- **Space Complexity:** O(n)
- **Note:** This is the naive recursive approach. For better performance, use memoization or iterative approach.

---

## How to Run

Each file contains a `main` method with example usage. To compile and run:

```bash
# Compile
javac FileName.java

# Run
java FileName
```

For example:

```bash
javac Factorial.java
java Factorial
```

## Key Concepts Covered

1. **Base Case:** Every recursive function needs a termination condition to prevent infinite recursion.
2. **Recursive Leap of Faith:** Assume the recursive call works correctly for a smaller subproblem.
3. **Recursive Relation:** Define how to build solution from smaller subproblems.
4. **Call Stack:** Understanding how recursion uses the call stack, leading to O(n) space complexity for linear recursions.
5. **Backtracking:** Some problems (like last occurrence, removing duplicates) process after returning from recursive calls.

## Future Improvements

- Add memoization to optimize exponential algorithms (Fibonacci, Tiling, Friends Pairing)
- Convert tail-recursive functions to iterative for better space efficiency
- Add input validation and error handling
- Create a master class to demonstrate all problems together

## Notes

- All programs assume valid input ranges (non-negative for most problems)
- Some implementations may cause StackOverflowError for very large n (typically n > 10000 depending on JVM stack size)
- Character-based operations assume lowercase English letters (a-z) for simplicity
