const { Route, Routes, Navigate } = require("react-router-dom");
const Home = require("pages/home").default;
const PostList = require("pages/posts").default;
const PostDetail = require("pages/posts/detail").default;
const PostNew = require("pages/posts/new").default;
const PostEdit = require("pages/posts/edit").default;


function Router({ isAuthenticated }) {
  return (
    <>
      <Routes>
        {isAuthenticated ? (
          <>
            <Route path="/" element={<Home />} />
            <Route path="/posts" element={<PostList />} />
            <Route path="/posts/:id" element={<PostDetail />} />
            <Route path="/posts/new" element={<PostNew />} />
            <Route path="/posts/edit/:id" element={<PostEdit />} />
            <Route path="/profile" element={<ProfilePage />} />
            <Route path="*" element={<Navigate replace to="/" />} />
          </>
        ) : (
          <>
            <Route path="/login" element={<LoginPage />} />
            <Route path="/signup" element={<SignupPage />} />
            <Route path="*" element={<LoginPage />} />
          </>
        )}
      </Routes>
    </>
  );
}

module.exports = Router;
