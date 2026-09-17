const express = require('express');
const expressLayouts = require('express-ejs-layouts');
const path = require('path');

const app = express();

app.use(expressLayouts);
app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));
app.set('layout', 'layout');

app.get('/', (req, res) => {
res.render('index', { title: 'Home' });
});

app.get('/about', (req, res) => {
res.render('about', { title: 'About' });
});

app.get('/contact', (req, res) => {
res.render('contact', { title: 'Contact' });
});

app.listen(3000, () => {
console.log('Server is running on port 3000');
});