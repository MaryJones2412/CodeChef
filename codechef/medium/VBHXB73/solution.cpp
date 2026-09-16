const express = require('express');

const app = express();

const PORT = 3000;

app.get('/', (req, res) => {
res.send('Welcome to the homepage!');
});

app.get('/products', (req, res) => {
res.send('Our products are coming soon!');
});

app.listen(PORT, () => {
console.log(`Server is running on port ${PORT}`);
});