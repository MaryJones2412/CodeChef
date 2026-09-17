});
console.log(`Server is running on port ${PORT}`);
const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {

res.json(books);
});

const books = [
{ "id": 1, "title": "The Hitchhiker's Guide to the Galaxy", "author": "Douglas Adams" },
{ "id": 2, "title": "Pride and Prejudice", "author": "Jane Austen" },
{ "id": 3, "title": "1984", "author": "George Orwell" }
];
const express = require('express');
const app = express();

app.get('/', (req, res) => {
res.send('<h1>Welcome to the Book Store!</h1>');
});

app.get('/books', (req, res) => {