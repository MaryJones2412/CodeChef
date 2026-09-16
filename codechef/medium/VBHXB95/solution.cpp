const express = require('express');
const app = express();
const port = 3000;

app.get('/divide', (req, res, next) => {
try {
const numerator = Number(req.query.numerator);
const denominator = Number(req.query.denominator);

if (isNaN(numerator) || isNaN(denominator)) {
throw new Error('Numerator and denominator must be numbers');
}

if (denominator === 0) {
const err = new Error('Division by zero');
err.type = 'DIV_ZERO';
throw err;
}

const result = numerator / denominator;
res.send(`Result: ${result}`);
} catch (err) {
next(err);
}
});

app.use((err, req, res, next) => {
console.error(err.stack);

if (err.type === 'DIV_ZERO') {
res.status(400).send('Cannot divide by zero.');
} else {
res.status(500).send('Something went wrong.');
}
});

app.listen(port, () => {
console.log(`Server running at http://localhost:${port}`);
});
