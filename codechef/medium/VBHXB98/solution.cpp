const express = require('express');
const path = require('path');

const app = express();

app.use(express.urlencoded({ extended: false }));
app.use(express.json());

app.use(express.static(path.join(__dirname, 'public')));

app.post('/submit-feedback-form', (req, res) => {
console.log('Form data received:');
console.log(req.body);
res.send('Feedback form data received!');
});

app.post('/submit-feedback-json', (req, res) => {
console.log('JSON data received:');
console.log(req.body);
res.json({ message: 'Feedback JSON data received!' });
});

const PORT = 3000;

app.listen(PORT, () => {
console.log(`Server listening on port ${PORT}`);
});