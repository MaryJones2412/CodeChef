            res.end(data);
        }
    });
});

server.listen(3000, () => {
    console.log('Server running at http://localhost:3000/');
});

            res.writeHead(200, { 'Content-Type': 'text/plain' });
        } else {
            res.end('Error reading file');
            res.writeHead(500, { 'Content-Type': 'text/plain' });
        if (err) {
    fs.readFile('my-file.txt', 'utf8', (err, data) => {
const server = http.createServer((req, res) => {

const fs = require('fs');
const http = require('http');