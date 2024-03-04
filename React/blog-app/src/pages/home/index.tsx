import { Link } from "react-router-dom"

export default function Home(){
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
            <div className="post-list">post list</div>
            <footer>
                <div>Menu 1</div>
                <div>Menu 2</div>
                <div>Menu 3</div>
            </footer>
        </div>
    )
}