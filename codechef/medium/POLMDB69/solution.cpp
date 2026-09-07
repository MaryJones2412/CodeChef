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
