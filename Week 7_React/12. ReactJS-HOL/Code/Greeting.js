function Greeting({ isLoggedIn }) {
  return (
    <h2 className="greeting">
      {isLoggedIn ? 'Welcome back!' : 'Please sign up to book flights.'}
    </h2>
  );
}

export default Greeting;
