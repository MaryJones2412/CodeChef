# POLMDB69

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Populating Author Details for a BlogPost

Alright, you've seen how Mongoose's `.populate()` method can bring related data together with the `Students` and `Courses` example. Now it's your turn to practice!

 **Your Goal:** 

You'll model `Authors` and `BlogPosts`. A `BlogPost` will have an `author` field that stores the ID of an `Author`. Your task is to:

- Define Mongoose schemas for Author and BlogPost.
- Create one sample author and one sample blog post written by this author.
- Fetch the blog post, first without populating the author details, and observe the output.
- Then, fetch the same blog post with populating the author details, and see how the author's information is now included.
#### Task:
- Write the 2 given below Schema.
- Author Schema (Author model): name: String bio: String
- BlogPost Schema (BlogPost model): title: String content: String author: Should store an ObjectId and use ref: 'Author' to link to the Author model.
- While printing add the code to populate the data.
#### Note:

When fetching with population, log the post's title, the fully populated `author` object, and specifically the author's name and bio from the populated data.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-07T01:43:21.248Z  

```cpp
  bio: String,
});
const Author = mongoose.model('Author', authorSchema);

// ✅ Step 3: Define the BlogPost Schema
const blogPostSchema = new mongoose.Schema({
  title: String,
  content: String,
  author: {
    type: mongoose.Schema.Types.ObjectId,
    ref: 'Author'
  }
});
const BlogPost = mongoose.model('BlogPost', blogPostSchema);

// ✅ Step 4: Create sample data
async function createSampleData() {
  console.log('\n--- Creating Sample Author and BlogPost ---');
  try {
    await Author.deleteMany({});
    await BlogPost.deleteMany({});

    const author = new Author({
      name: 'Jane Writer',
      bio: 'Loves to write about Node.js and Mongoose.'
    });
    const savedAuthor = await author.save();
    console.log('✅ Author created:', savedAuthor.name);

    const post = new BlogPost({
      title: 'Understanding Mongoose Population',

mongoose.connect(uri, {
  useNewUrlParser: true,
  useUnifiedTopology: true,
})
.then(() => console.log('✅ Connected to MongoDB Atlas'))
.catch(err => console.error('❌ MongoDB connection error:', err));

// ✅ Step 2: Define the Author Schema
const authorSchema = new mongoose.Schema({
  name: String,
const uri="mongodb+srv://mmaryjones2412_db_user:M.Mary2412@cluster0.efjh5pi.mongodb.net/?appName=Cluster0";
// ✅ Step 1: Connect to MongoDB Atlas (Update URI with your credentials)
const mongoose = require('mongoose');

```

---

[View on CodeChef](https://www.codechef.com/problems/POLMDB69)