import { Link } from "react-router-dom"

export default function Home() {
    return (
        <div>
            {/** header, footer는 모든 페이지에 공통으로 들어가는 부분 */}
            <header>
                {/**링크를 이용하여 페이지 간 연결*/}
                <div>
                    <Link to="/posts/new">글쓰기</Link>
                    <Link to="/posts">게시글</Link>
                    <Link to="/profile">프로필</Link>
                </div>
            </header>
            <div className="post__navigation">
                <div className="post__navigation--active">전체</div>
                <div>나의 글</div>
            </div>
            <div className="post__list">
                {[...Array(10)].map((e, index) => (
                    <div key={index} className="post__box">
                        <Link to={`/posts/${index}`}>
                            <div className="post__profile-box">
                                <div className="post__profile" />
                                <div className="post__author-name">패스트캠퍼스</div>
                                <div className="post__date">2024.03.04 월요일</div>
                            </div>
                            <div className="post__title">게시글 {index}</div>
                            <div className="post__text">
                                Vivamus ante purus, efficitur a posuere tempus, feugiat vel magna. Ut euismod neque massa, quis luctus leo venenatis ac. Nunc auctor dui a scelerisque lacinia. Duis ac lectus sed libero efficitur faucibus. Maecenas condimentum leo sem, at rutrum purus tristique a. Duis congue mi tortor, ut volutpat ante pharetra id. Sed at tincidunt purus. Integer suscipit tortor eros, in blandit justo congue quis. Nullam pellentesque erat nec purus hendrerit, quis commodo ligula tempor. Integer congue consequat nisi, consectetur mattis nulla lobortis eget. Nunc feugiat bibendum est ac laoreet. Vivamus sed pellentesque odio, et placerat orci. Maecenas rhoncus maximus leo efficitur posuere. Proin cursus, turpis vel pretium sollicitudin, ipsum dui laoreet ex, ac blandit sapien dui quis ante. Vestibulum mi ex, venenatis faucibus arcu ut, convallis euismod ipsum. Mauris imperdiet risus ex, eget condimentum sapien finibus et.
                            </div>
                            <div className="post__utils-box">
                                <div className="post__delete">삭제</div>
                                <div className="post__edit">수정</div>
                            </div>

                        </Link>
                    </div>
                ))}
            </div>
            <footer>
                <Link to="/posts/new">글쓰기</Link>
                <Link to="/posts">게시글</Link>
                <Link to="/profile">프로필</Link>
            </footer>
        </div>
    )
}