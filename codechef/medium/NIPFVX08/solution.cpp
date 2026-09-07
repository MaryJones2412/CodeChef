const express = require('express');
const mongoose = require('mongoose');

// Initialize Express app
const app = express();
const port = 3000;

// Use Atlas connection string (use your own string to connect to the database)


// Connect to MongoDB Atlas
mongoose.connect(mongoURI)
  .then(() => {
    console.log('✅ Connected to MongoDB Atlas');
  })
  .catch((err) => {
    console.error('❌ MongoDB connection error:', err);
  });

// Basic route
app.get('/', (req, res) => {
  res.send('Hello from MyTasks App connected to MongoDB Atlas!');
});

// Start server
app.listen(port, () => {
  console.log(`🚀 Server is running at http://localhost:${port}`);
});
const mongoURI="mongodb+srv://mmaryjones2412_db_user:M.Mary2412@cluster0.efjh5pi.mongodb.net/?appName=Cluster0";
