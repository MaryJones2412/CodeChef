} else {
try {
fs.writeFileSync(initialFilePath, '');
console.log('File created successfully!');
} catch (err) {
console.error('Error creating file:', err);
}
}
if (fs.existsSync(initialFilePath)) {
console.log('File already exists!');

const renamedFilePath = 'newFile.txt';
const initialFilePath = 'file.txt';

const fs = require('fs');