export function IndianPlayers() {
  const T20Players = ['Surya', 'Pandya', 'Pant'];
  const RanjiTrophyPlayers = ['Prasad', 'Hebbar', 'Rathore'];

  const allIndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>List of Indian Players Merged:</h2>
      <ul>
        {allIndianPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
}
