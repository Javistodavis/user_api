const express = require('express');
const app = express();
const PORT = process.env.PORT || 3000;

// Sample JSON data array matching required attributes
const users = [
  {
    FirstName: "Juan",
    LastName: "Dela Cruz",
    Email: "juan.delacruz@example.com",
    Password: "password123"
  },
  {
    FirstName: "Maria",
    LastName: "Santos",
    Email: "maria.santos@example.com",
    Password: "securepassword456"
  },
  {
    FirstName: "John",
    LastName: "Doe",
    Email: "john.doe@example.com",
    Password: "mypassword789"
  }
];

// Endpoint returning the list of users
app.get('/api/users', (req, res) => {
  res.json(users);
});

// Root route for quick browsing check
app.get('/', (req, res) => {
  res.send('API is running. Access user list at /api/users');
});

app.listen(PORT, () => {
  console.log(`Server running on port ${PORT}`);
});
