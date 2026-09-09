# VBHXB49

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Analyze and Modify Book File Paths

Okay, let's test your understanding of the `path` module with a new challenge!

Imagine you're building a program to manage a digital library. You need to process file paths for book files.

### Task:
- Construct a file path by combining the directory books, a sub-directory representing the genre fiction, and a filename representing the book title The_Great_Novel.pdf. Assume you're starting from the project's root directory.
- Convert the constructed path into an absolute path based on the current location of the script.
- From the absolute path, extract the filename, change its extension from.pdf to.epub, and create a new path using the updated filename and the same directory.
- Print both the original absolute path and the new absolute path with the changed extension to the console.

The final output should look like this:

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T06:42:51.104Z  

```cpp
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

```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB49)