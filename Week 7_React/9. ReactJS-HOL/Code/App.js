import './App.css';
import { ListofPlayers } from './Components/ListofPlayers';
import { FilteredPlayers } from './Components/FilteredPlayers';
import { OddPlayers } from './Components/OddPlayers';
import { EvenPlayers } from './Components/EvenPlayers';
import { IndianPlayers } from './Components/IndianPlayers';

function App() {

  const players = [
  { name: 'Rohit', score: 80 },
  { name: 'Virat', score: 95 },
  { name: 'Iyer', score: 68 },
  { name: 'Rahul', score: 88 },
  { name: 'Pant', score: 75 },
  { name: 'Bumrah', score: 5 },
  { name: 'Jadeja', score: 45 },
  { name: 'Patel', score: 30 },
  { name: 'Pandya', score: 90 },
  { name: 'Gill', score: 85 },
  { name: 'Shami', score: 2 },
];

  const flag = true;
  return (
    <div className="App">
      <h1>🏏 Cricket App</h1>

      {
        flag?(
          <>
            <ListofPlayers players={players}/>
            <FilteredPlayers players={players}/>
          </>):
          (<>
            <OddPlayers players={players} />
            <EvenPlayers players={players}/>
            <IndianPlayers />
          </>)
      }

      
    </div>
  );
}

export default App;
