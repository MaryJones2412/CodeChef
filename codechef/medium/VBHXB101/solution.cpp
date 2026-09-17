const express = require('express');
const app = express();

app.use(express.json());

app.post('/contact', (req, res) => {
const { name, email, message } = req.body;

if (!name || !email || !message) {
return res.status(400).send('Name, email, and message are required.');
}

if (typeof name !== 'string' || name.trim() === '' || typeof message !== 'string' || message.trim() === '') {
return res.status(400).send('Name and message must be non-empty strings.');
}

if (typeof email !== 'string' || !email.includes('@')) {
return res.status(400).send('Invalid email format.');
}

console.log('Received data:', { name, email, message });
res.send('Data received successfully!');
});

app.listen(8080, () => {
console.log('Server listening on port 8080');
});