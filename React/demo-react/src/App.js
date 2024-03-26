import logo from './logo.svg';
import './App.css';
import { useEffect, useState } from 'react';

function App() {

  const [test, setTest] = useState('test');

  useEffect(() =>{

    fetch("http://localhost:8088/api")
      .then(res => res.json())
      .then(data => {
        console.log(data);
        setTest(data.message);
      });
  });


  return (


    <>
    
    <div>
      {test}
    </div>
    </>
  );
}

export default App;
