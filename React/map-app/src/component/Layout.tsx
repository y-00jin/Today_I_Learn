import { ReactNode } from "react";
import Navbar from "./Navbar";

{/** 타입 ReactNode로 지정 */}
interface LayoutProps {
  children: ReactNode;
}

export default function Layout({ children }: LayoutProps) {
  return (
    <div className="layout">
      <Navbar />
      {children}
    </div>
  );
}