import React from 'react';

export function EvenPlayers({ players }) {
  const EvenPlayers = players.filter((_, index) => index % 2 === 0);

  return (
    <div>
      <h3>Even Players</h3>
      <ul>
        {EvenPlayers.map((player, index) => (
          <li key={index}>
            Mr. {player.name} - <span>{player.score}</span>
          </li>
        ))}
      </ul>
    </div>
  );
}
