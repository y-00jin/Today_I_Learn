import Header from "components/Header"
import Footer from "components/Footer"
import PostList from "components/PostList"

export default function Home() {
    return (
        <div>
            {/** header, footer는 모든 페이지에 공통으로 들어가는 부분 */}
            <Header/>
            <PostList/>
            <Footer/>
        </div>
    )
}