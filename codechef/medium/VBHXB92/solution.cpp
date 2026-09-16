const express = require('express');
const app = express();
const port = 3000;

const logPathMiddleware = (req, res, next) => {
console.log(`Requested Path: ${req.path}`);
next();
};

const addCustomMessageMiddleware = (req, res, next) => {
req.customMessage = 'Welcome to our API!';
next();
};

app.use(logPathMiddleware);
app.use(addCustomMessageMiddleware);

app.get('/', (req, res) => {
res.send(`Hello World! ${req.customMessage}`);
});

app.listen(port, () => {
console.log(`Server running at http://localhost:${port}`);
});