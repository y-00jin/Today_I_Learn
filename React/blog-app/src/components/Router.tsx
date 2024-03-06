import { Route, Routes, Navigate } from 'react-router-dom';
import Home from 'pages/home';
import PostLIst from 'pages/posts';
import PostDetail from 'pages/posts/detail';
import PostNew from 'pages/posts/new';
import PostEdit from 'pages/posts/edit';
import ProfilePage from 'pages/profile';
import LoginPage from 'pages/login';
import SignupPage from 'pages/signup';


export default function Router() {
  return (
    <>
      {/** 경로 설정 */}
      <Routes>
        <Route path="/" element={<Home/>} />   {/** 루트(/) 경로를 라우터로 잡아줌 */}
        <Route path="/posts" element={<PostLIst/>} />
        <Route path="/posts/:id" element={<PostDetail/>} />
        <Route path="/posts/new" element={<PostNew/>} />
        <Route path="/posts/edit/:id" element={<PostEdit/>} />
        <Route path="/profile" element={<ProfilePage/>} />
        <Route path="/login" element={<LoginPage/>} />
        <Route path="/signup" element={<SignupPage/>} />
        
        {/** 설정된 경로를 제외한 나머지 경로로 접속한 경우 루트 페이지로 이동 */}
        <Route path="*" element={<Navigate replace to="/" />} />  
      </Routes>
    </>
  );

}