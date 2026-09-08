# VBHXB22

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Simulate File Processing with Error Handling

Let's practice how to handle errors in using different functions:

### Task:
- Complete the code to handle errors using async/await.
- Complete the code to handle errors using.then()/.catch().
- Complete the code to handle errors using callback function and print the result or error in the given way:

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T01:49:50.905Z  

```cpp
  } else {
  callback(new Error(`Could not fetch weather for ${city}`), null);
  }
  }, 50);
  }

  function getWeatherCallback(city) {
  fetchWeatherWithCallback(city, (error, result) => {
  if (error) {
  console.log("Callback Error:", error);
  } else {
  console.log("Callback:", result);
  }
  });
  }

  getWeatherAsync("Delhi");
  getWeatherPromise("Mumbai");
  getWeatherCallback("Bangalore");

```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB22)