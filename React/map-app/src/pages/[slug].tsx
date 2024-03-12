import Link from "next/link";
import { useRouter } from "next/router";

export default function Page() {
    const router = useRouter();
    return (
        <div>
            {/** url에 들어가는 slug는 아래와 같이 표현 */}
            <h1>Page : {router.query.slug}</h1>

            {/** push : 뒤로가기 시 전페이지로 이동 */}
            <div>
                <button type="button" onClick={() => {
                    router.push({ pathname: "/[slug]", query: { slug: "push" } });
                }}
                >
                    PUSH
                </button>
            </div>
            <br />


            {/** replace : 뒤로가기 시 전전페이지로 () */}
            <div>
                <button type="button" onClick={() => {
                    router.replace({ pathname: "/[slug]", query: { slug: "push" } });
                }}
                >
                    REPLACE
                </button>
            </div>
            <br />
            <div>
                <button type="button" onClick={() => {
                    router.reload();
                }}
                >
                    RELOAD
                </button>
            </div>
            <br/>


            <div>
                <Link href="/hello">Hello</Link>
            </div>

            <div>
                <Link href="/bye">bye</Link>
            </div>




        </div>

    )
}
