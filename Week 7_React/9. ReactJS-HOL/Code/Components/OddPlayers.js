import React from 'react';

export function OddPlayers({ players }) {
  const oddPlayers = players.filter((_, index) => index % 2 === 1);

  return (
    <div>
      <h3>Odd Players</h3>
      <ul>
        {oddPlayers.map((player, index) => (
          <li key={index}>
            Mr. {player.name} - <span>{player.score}</span>
          </li>
        ))}
      </ul>
    </div>
  );
}
