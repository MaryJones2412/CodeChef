# VBHXB15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Simulate Coffee Brewing Process

Let's create a worked example that simulates making a cup of coffee! We'll break the process down into asynchronous steps using Promises and chain them together. This will demonstrate how Promise chains can manage a sequence of operations.

Here's the scenario:

- Grind Beans: This asynchronous function will simulate grinding coffee beans. It will resolve with the string "Ground coffee beans".
- Brew Coffee: This asynchronous function will take the ground beans as input and simulate brewing the coffee. It will resolve with the string "Brewed coffee".
- Add Milk: This asynchronous function will take the brewed coffee as input and simulate adding milk. It will resolve with the string "Coffee with milk".

We'll use `setTimeout` to simulate the time each step takes. We'll also include a final `console.log` to confirm the entire process is asynchronous.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T10:49:42.226Z  

```cpp
  console.log("Coffee brewing in progress...");
  
    });
      console.error("Error:", error);
    })
    .catch((error) => {
    })
    .then((coffeeWithMilk) => {
      console.log("3. Final result:", coffeeWithMilk);
      return addMilk(brewedCoffee);
    .then((brewedCoffee) => {
      console.log("2. Coffee brewed:", brewedCoffee);
    })
    .then((groundBeans) => {
      console.log("1. Beans ground:", groundBeans);
      return brewCoffee(groundBeans);
  }
  
  grindBeans()
    });
      }, 500);
        resolve("Coffee with milk: " + brewedCoffee);
    return new Promise((resolve) => {
      setTimeout(() => {
  function addMilk(brewedCoffee) {
  }
  
    });
        resolve("Brewed coffee with " + groundBeans);
      }, 500);
      setTimeout(() => {
  function brewCoffee(groundBeans) {
    return new Promise((resolve) => {
  
  }
    });
      }, 500);
        resolve("Ground coffee beans");
function grindBeans() {
    return new Promise((resolve) => {
      setTimeout(() => {
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB15)