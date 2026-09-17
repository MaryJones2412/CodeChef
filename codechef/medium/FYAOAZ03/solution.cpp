// write your code here
const express = require('express');
const path = require('path');

const app = express();

// Configure Express to use EJS and set views directory
app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));

// Homepage route rendering index.ejs
app.get('/', (req, res) => {
    res.render('index');
    });

    // Start server on port 3000
    app.listen(3000, () => {
        console.log('Server is running on port 3000');
        });