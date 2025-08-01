import React from 'react';


export function FilteredPlayers({players}) {
  const playersBelow70 = players.filter((item) => item.score <= 70);

  return (
    <div>
      <h2>Players with Score ≤ 70</h2>
      <ul>
        {playersBelow70.map((item, index) => (
          <li key={index}>
            {item.name} - {item.score}
          </li>
        ))}
      </ul>
    </div>
  );
}
