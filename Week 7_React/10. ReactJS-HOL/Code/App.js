import './App.css';
function App() {
  const officeSpaces = [
    {
      Name: 'DBS',
      Rent: 50000,
      Address: 'Chennai',
      Image: 'https://t4.ftcdn.net/jpg/03/84/55/29/360_F_384552930_zPoe9zgmCF7qgt8fqSedcyJ6C6Ye3dFs.jpg',
    },
    {
      Name: 'Unitech',
      Rent: 70000,
      Address: 'Bengalore',
      Image: 'https://static.vecteezy.com/ti/photos-gratuite/t2/39204243-ai-genere-flou-contexte-de-une-lumiere-moderne-bureau-interieur-avec-sol-a-plafond-les-fenetres-photo.jpeg',
    },
    {
      Name: 'Ecospace',
      Rent: 45000,
      Address: 'Kolkata',
      Image: 'https://img.freepik.com/free-photo/modern-office-space-with-city-view_23-2151972862.jpg?semt=ais_hybrid&w=740&q=80',
    },
    {
      Name: 'Golden Avenue',
      Rent: 65000,
      Address: 'Delhi',
      Image: 'https://media.istockphoto.com/id/176842512/photo/a-conference-room-full-of-windows-and-orange-chairs.jpg?s=612x612&w=0&k=20&c=Ui1NcY1YS5PDiR5zB4DtTCocV8RSAtBiQgquy4XLIq8=',
    }
  ];

  return (
    <div className="App">
      <h1>Office Space, at Affordable Range</h1>

      {officeSpaces.map((item, index) => {
        const rentClass = item.Rent <= 60000 ? 'textRed' : 'textGreen';

        return (
          <div key={index} className="card">
            <img src={item.Image} width="25%" height="25%" alt="Office Space" />
            <h1>Name: {item.Name}</h1>
            <h3 className={rentClass}>Rent: Rs. {item.Rent}</h3>
            <h3>Address: {item.Address}</h3>
          </div>
        );
      })}
    </div>
  );
}

export default App;
