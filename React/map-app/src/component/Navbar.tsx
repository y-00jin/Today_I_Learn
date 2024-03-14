import { useState } from "react";
import Link from "next/link";

{/** 아이콘 */ }
import { BiMenu } from "react-icons/bi";
import { AiOutlineClose } from "react-icons/ai";



export default function Navbar() {
    const [isOpen, setIsOpen] = useState(false);
    return (
        <>
            {/** navbar PC */}
            <div className="navbar">
                <div className="navbar__logo">nextmap</div>
                <div className="navbar__list">
                    <Link href="/stores" className="navbar__list--item">
                        맛집 목록
                    </Link>
                    <Link href="/stores/new" className="navbar__list--item">
                        맛집 등록
                    </Link>
                    <Link href="/users/likes" className="navbar__list--item">
                        찜한 가게
                    </Link>
                    <Link href="/users/login" className="navbar__list--item">
                        로그인
                    </Link>
                </div>

                {/* mobile navbar : 모바일에서 메뉴바를 열고 닫을 수 있도록 함 */}
                <div
                    role="presentation"
                    className="navbar__button"
                    onClick={() => setIsOpen((val) => !val)}
                >
                    {isOpen ? <AiOutlineClose /> : <BiMenu />}    {/** 열린 상태에 따라 close아이콘 <-> menu 아이콘  */}
                </div>
            </div>

            {/* mobile navbar */}
            {isOpen && (
                <div className="navbar--mobile">
                    <div className="navbar__list--mobile">
                        <Link href="/stores" className="navbar__list--item--mobile">
                            맛집 목록
                        </Link>
                        <Link href="/stores/new" className="navbar__list--item--mobile">
                            맛집 등록
                        </Link>
                        <Link href="/users/likes" className="navbar__list--item--mobile">
                            찜한 가게
                        </Link>
                        <Link href="/users/login" className="navbar__list--item--mobile">
                            로그인
                        </Link>
                    </div>
                </div>
            )}


        </>
    )
}