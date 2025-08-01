import React, { useState } from 'react';
import LoginButton from './LoginButton';
import LogoutButton from './LogoutButton';
import Greeting from './Greeting';
import GuestPage from './GuestPage';
import UserPage from './UserPage';
import './App.css';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => setIsLoggedIn(true);
  const handleLogoutClick = () => setIsLoggedIn(false);

  return (
    <div className="app-container">
      <h1 className="main-heading"> Welcome to Flight Booker</h1>
      <Greeting isLoggedIn={isLoggedIn} />
      {isLoggedIn ? (
        <>
          <LogoutButton onClick={handleLogoutClick} />
          <UserPage />
        </>
      ) : (
        <>
          <LoginButton onClick={handleLoginClick} />
          <GuestPage />
        </>
      )}
    </div>
  );
}

export default App;
