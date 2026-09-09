// write your code here
const path = require('path');

const booksDir = 'books';
const genreDir = 'fiction';
const fileName = 'The_Great_Novel.pdf';

const relativePath = path.join(booksDir, genreDir, fileName);
const absolutePath = path.resolve(relativePath);

const baseName = path.basename(absolutePath);
const newFileName = path.basename(baseName, '.pdf') + '.epub';
const newAbsolutePath = path.join(path.dirname(absolutePath), newFileName);

console.log('Original Absolute Path:', absolutePath);
console.log('New Absolute Path:', newAbsolutePath);
