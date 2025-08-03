import React from 'react';
import ListofPlayers from './components/ListofPlayers.jsx';
import IndianPlayers from './components/IndianPlayers.jsx';

function App() {
  const flag = false; // change to false to show IndianPlayers instead

  return (
    <div className="App">
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
