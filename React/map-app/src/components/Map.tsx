import { Dispatch, SetStateAction } from "react";
import Script from "next/script";
import * as stores from "@/data/store_data.json";
declare global {
    interface Window {
        kakao: any;
    }
}

const DEFAULT_LAT = 37.497625203;
const DEFAULT_LNG = 127.03088379;

interface MapProps {
    setMap: Dispatch<SetStateAction<any>>;
}
export default function Map({setMap}:MapProps) {

    const loadKaKaoMap = () => {
        // kakao map load
        window.kakao.maps.load(() => {
            const mapContainer = document.getElementById("map");
            const mapOption = {
                center: new window.kakao.maps.LatLng(DEFAULT_LAT, DEFAULT_LNG),
                level: 3,
            };
            const map = new window.kakao.maps.Map(mapContainer, mapOption);
            setMap(map);
        })
    }


    return (
        <>
            <Script
                strategy="afterInteractive"
                type="text/javascript"
                src={`//dapi.kakao.com/v2/maps/sdk.js?appkey=${process.env.NEXT_PUBLIC_KAKAO_MAP_CLIENT}&autoload=false`}
                onReady={loadKaKaoMap}
            />
            <div id="map" className="w-full h-screen"></div>
        </>
    )

}