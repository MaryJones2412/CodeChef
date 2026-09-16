// write your code here.
const express = require('express');
const app = express();

app.get('/hello', (req, res) => {
res.send(req.url);
});

app.listen(3000, () => {
console.log('Server is running on port 3000');
});