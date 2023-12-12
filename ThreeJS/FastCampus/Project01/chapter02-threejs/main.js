import "./style.css";
import * as THREE from "three";


// 장면 생성
const scene = new THREE.Scene();

// 카메라 생성
const camera = new THREE.PerspectiveCamera(
    60,           // fov : 시야각
    window.innerWidth / window.innerHeight,    // aspect : 카메라의 가로, 세로 비율
    0.1,        // near : 카메라가 가장 가까이 잡을 수 있는 곳
    100        // far : 카메라가 가장 멀리 잡을 수 있는 곳
);
camera.position.y = 1;		// 카메라 y 값 설정
camera.position.z = 5;		// 카메라 z 값 설정

// Mesh 오브젝트 생성
const geometry = new THREE.BoxGeometry(1,1,1);                  // 박스 오브젝트 생성
const material = new THREE.MeshBasicMaterial({color:0xff0000})  // 오브젝트 스타일
const mesh = new THREE.Mesh(geometry, material);                // Mesh 오브젝트 생성

// 생성한 오브젝트를 scene에 추가
scene.add(mesh);

// 생성한 scene을 renderer로 송출
const renderer = new THREE.WebGLRenderer();
renderer.setSize(window.innerWidth, window.innerHeight);     // renderer 사이즈 설정
document.body.appendChild(renderer.domElement)   // 완성된 결과물을 html에 추가

// 크기가 변경될 경우의 이벤트 리스너 추가
window.addEventListener('resize', () => {
    camera.aspect = window.innerWidth / window.innerHeight;     // 카메라 가로 세로 비율 재설정
    camera.updateProjectionMatrix();                            // 카메라를 재설정하면 무조건 해줘야함
    renderer.setSize(window.innerWidth, window.innerHeight);    // renderer 사이즈 재설정
    renderer.render(scene, camera);                             // renderer 재설정
})

renderer.render(scene, camera);



