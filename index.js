const express = require('express');
const app = express();
const PORT = process.env.PORT || 3000;

const users = [
  {
    FirstName: "Ada",
    LastName: "Lovelace",
    Email: "ada.lovelace@example.com",
    Password: "hashed_password_123"
  },
  {
    FirstName: "Alan",
    LastName: "Turing",
    Email: "alan.turing@example.com",
    Password: "hashed_password_456"
  },
  {
    FirstName: "Grace",
    LastName: "Hopper",
    Email: "grace.hopper@example.com",
    Password: "hashed_password_789"
  }
];

// Endpoint returning the list of users
app.get('/api/users', (req, res) => {
  res.json(users);
});

// Root route check
app.get('/', (req, res) => {
  res.send('User API is active. Go to /api/users to view data.');
});

app.listen(PORT, () => {
  console.log(`Server running on port ${PORT}`);
});
