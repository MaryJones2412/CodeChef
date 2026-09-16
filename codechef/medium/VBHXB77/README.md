# VBHXB77

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Send back request URL

Let's practice working with the `request` object in Express a bit more.

As you know, the `request` object contains a wealth of information about the incoming request. Besides headers, it also holds the URL that the client requested.

Your task is to create an Express application that listens on port 3000. When a user visits the path `/hello`, your application should extract the requested URL from the `request` object and send it back as the response.

### Task:
- Set up an Express application: You'll need to create an Express application instance and define a route for the path /hello.
- Access the request URL: Inside the route handler, you'll access the requested URL from the request.url property.
- Send the URL in the response: Use the response.send() method to send the URL string back to the client.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T06:22:42.923Z  

```cpp
// write your code here.
const express = require('express');
const app = express();

app.get('/hello', (req, res) => {
res.send(req.url);
});

app.listen(3000, () => {
console.log('Server is running on port 3000');
});
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB77)