import React from 'react';



export function ListofPlayers({players}) {
  return (
    <div>
      <h2>List of Players</h2>
      <ul>
        {players.map((item, index) => (
          <li key={index}>
            Mr. {item.name} - <span>{item.score}</span>
          </li>
        ))}
      </ul>
    </div>
  );
}
