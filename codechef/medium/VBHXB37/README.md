# VBHXB37

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### How the Event Loop Works

Node.js follows these steps to handle operations:

1] Execute Main Script – Runs your JavaScript code line by line (synchronously).
2] Microtasks – Executes process.nextTick() and Promises immediately after main code.
3] Timers – Runs setTimeout() and setInterval() callbacks when their time is up.
4] I/O Callbacks – Handles results of file, network, or system operations.
5] setImmediate – Executes callbacks scheduled with setImmediate().
6] Close Events – Handles cleanup tasks like closing sockets or streams.

 **Let's understand this by the given Example** 

Expected Output:

```
Start
End
Next Tick
Promise
Timeout
Immediate

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T06:23:48.218Z  

```cpp

  setImmediate(() => {
    console.log("Immediate");
  });

  setTimeout(() => {
    console.log("Timeout");
  }, 0);

  console.log("End");
}

module.exports = { runOrderExample };

if (require.main === module) {
  runOrderExample();
}
  });
    console.log("Promise");
  Promise.resolve().then(() => {

  });
    console.log("Next Tick");
  process.nextTick(() => {

  console.log("Start");
function runOrderExample() {
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB37)