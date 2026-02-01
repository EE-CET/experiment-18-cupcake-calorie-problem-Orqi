[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/VblSQg8Z)
# Experiment 18: Cupcake Calorie Problem

## Problem Statement

Marc loves cupcakes. Each cupcake has a calorie count, and Marc can walk a distance to burn those calories.
On eating the $j^{th}$ cupcake with $c$ calories, he must walk at least $(2^j) \times c$ miles to maintain his weight.

Given the individual calorie counts for each of the cupcakes, determine the **minimum** number of miles Marc must walk to maintain his weight.
**Note:** He can eat the cupcakes in any order. To minimize the miles, think about which order is best!

## Input Format

* The first line contains an integer $n$, the number of cupcakes.
* The next line inputs the calories of $n$ cupcakes.

## Output Format

Print a single integer denoting the minimum miles necessary.

### Example 1

**Input:**

```text
3
1 3 2
```

**Output:**

```text
11
```

**Explanation:**
* Eat cupcake with 3 calories first: $3 \times 2^0 = 3$.
* Eat cupcake with 2 calories second: $2 \times 2^1 = 4$.
* Eat cupcake with 1 calorie third: $1 \times 2^2 = 4$.
* Total = $3 + 4 + 4 = 11$.

(If we ate them in the order 1, 2, 3, the cost would be $1\times1 + 2\times2 + 3\times4 = 17$, which is higher).
