import React, { useState } from 'react';

function GuestPage({ onLogin }) {
  return (
    <div style={{ textAlign: 'center', marginTop: '100px' }}>
      <h1>Please sign up.</h1>
      <button onClick={onLogin}>Login</button>
      <FlightDetails />
    </div>
  );
}

function UserPage({ onLogout }) {
  return (
    <div style={{ textAlign: 'center', marginTop: '100px' }}>
      <h1>Welcome back</h1>
      <button onClick={onLogout}>Logout</button>
      <FlightDetails />
      <BookTickets />
    </div>
  );
}

function FlightDetails() {
  return (
    <div style={{ marginTop: '30px' }}>
      <h2>Flight Details</h2>
      <ul>
        <li>Flight: AI 202 | From: Delhi | To: Chennai | Time: 08:00 AM</li>
        <li>Flight: SG 456 | From: Mumbai | To: Bangalore | Time: 01:00 PM</li>
        <li>Flight: IND 789 | From: Kolkata | To: Hyderabad | Time: 06:00 PM</li>
      </ul>
    </div>
  );
}

function BookTickets() {
  return (
    <div style={{ marginTop: '20px' }}>
      <h2>Book Your Ticket</h2>
      <button>Book Now</button>
    </div>
  );
}

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
  }

  const handleLogout = () => {
    setIsLoggedIn(false);
  }

  return isLoggedIn ? <UserPage onLogout={handleLogout} /> : <GuestPage onLogin={handleLogin} />;
}

export default App;
