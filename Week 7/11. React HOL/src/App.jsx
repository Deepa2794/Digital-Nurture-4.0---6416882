import React, { useState } from 'react';
import CurrencyConverter from './CurrencyConverter';

const App = () => {
  const [count, setCount] = useState(5);

  const handleIncrement = () => {
    increment();
    sayHello("Hello Member1");
  };

  const increment = () => {
    setCount(count + 1);
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayHello = (msg) => {
    alert(msg);
  };

  const sayWelcome = (text) => {
    alert(text);
  };

  const handleClick = (event) => {
    alert("I was clicked");
  };

  return (
    <div style={{ margin: '20px' }}>
      <h3>{count}</h3>

      <button onClick={handleIncrement}>Increment</button>
      <br /><br />

      <button onClick={decrement}>Decrement</button>
      <br /><br />

      <button onClick={() => sayWelcome("welcome")}>Say welcome</button>
      <br /><br />

      <button onClick={handleClick}>Click on me</button>

      <hr />
      <CurrencyConverter />
    </div>
  );
};

export default App;
