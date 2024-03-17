/* eslint-disable */

import './App.css';
import { useState } from 'react';

function App() {

  let [title, setTitle] = useState(['남자 코트 추천', '강남 우동 맛집', '파이썬 독학']);
  let [like, setLike] = useState(0);

  return (
    <div className="App">
      <div className="black-nav">
        <h4>ReactBlog</h4>
      </div>

      <button onClick={() => {
        let copy = [...title];
        copy[0] = '여자 코트 추천';
        setTitle(copy);
      }} >야호</button>

      <button onClick={() => {
        let copy = [...title];
        setTitle(copy.sort());
      }} >가나다순정렬</button>

      {
        title.map((title) => (
          <div key={title} className="list">
            <h4>{title} <span onClick={() => { setLike(like++) }}>👍 </span>{like}</h4>
            <p>3월 18일 발행</p>
          </div>
        ))
      }
    </div>
  );
}

export default App;
