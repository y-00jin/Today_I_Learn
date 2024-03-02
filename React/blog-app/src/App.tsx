import './App.css';
import { Route, Routes, Navigate, Link } from 'react-router-dom';


function App() {
  return (
    <>
      {/** Link를 통해 클릭하면 원하는 페이지로 이동 */}
      <ul>
        <li>
          <Link to="/">Home</Link>
        </li>
        <li>
          <Link to="/posts">Post List</Link>
        </li>
        <li>
          <Link to="/posts/:id">Post Detail</Link>
        </li>
        <li>
          <Link to="/posts/new">Post New</Link>
        </li>
        <li>
          <Link to="/posts/edit/:id">Post Edit</Link>
        </li>
        <li>
          <Link to="/profile">Profile</Link>
        </li>

      </ul>

      {/** 경로 설정 */}
      <Routes>
        <Route path="/" element={<h1>Home Page</h1>} />   {/** 루트(/) 경로를 라우터로 잡아줌 */}
        <Route path="/posts" element={<h1>Post List Page</h1>} />
        <Route path="/posts/:id" element={<h1>Post Detail Page</h1>} />
        <Route path="/posts/new" element={<h1>Post New Page</h1>} />
        <Route path="/posts/edit/:id" element={<h1>Post Edut Page</h1>} />
        <Route path="/profile" element={<h1>Profile Page</h1>} />
        
        {/** 설정된 경로를 제외한 나머지 경로로 접속한 경우 루트 페이지로 이동 */}
        <Route path="*" element={<Navigate replace to="/" />} />  
      </Routes>
    </>
  );

}

export default App;
