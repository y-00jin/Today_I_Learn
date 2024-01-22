import "./style.css";
import * as THREE from "three";
import {OrbitControls} from "three/examples/jsm/controls/OrbitControls"

// 생성한 scene을 renderer로 송출
const renderer = new THREE.WebGLRenderer({antialias: true});       // antialias : 박스 표면 부드럽게
renderer. shadowMap.enabled = true;                           // Mesh에 그림자 생성 가능하도록 함
renderer.setSize(window.innerWidth, window.innerHeight);     // renderer 사이즈 설정
document.body.appendChild(renderer.domElement)   // 완성된 결과물을 html에 추가

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

// 빛 생성
const directionalLight = new THREE.DirectionalLight(0xffffff, 5);   // 색, 빛의 세기
directionalLight.castShadow = true;     // 그림자 생성
directionalLight.position.set(3,4,5);   // 빛의 위치 설정
directionalLight.lookAt(0, 0, 0);       // 빛이 어디를 바라볼 것인지 설정
scene.add(directionalLight);

// 바닥 Mesh 오브젝트 생성
const floorGeometry = new THREE.PlaneGeometry(20,20);                   // 가로, 세로
const floorMaterial = new THREE.MeshStandardMaterial({color:0xbbbbbb}); // 바닥 Mesh 오브젝트 스타일
const floor = new THREE.Mesh(floorGeometry, floorMaterial);             // 바닥 Mesh 오브젝트 생성
floor.rotation.x = -Math.PI / 2;       // 바닥 Mesh 회전
floor.receiveShadow = true;            // 그림자 받음
floor.castShadow = true;               // 그림자 생성
scene.add(floor);    // 바닥 오브젝트를 scene에 추가


// 마우스 드래그으로 카메라 시점 변경
const orbitControls = new OrbitControls(camera, renderer.domElement);
orbitControls.update();

// 크기가 변경될 경우의 이벤트 리스너 추가
window.addEventListener('resize', () => {
    camera.aspect = window.innerWidth / window.innerHeight;     // 카메라 가로 세로 비율 재설정
    camera.updateProjectionMatrix();                            // 카메라를 재설정하면 무조건 해줘야함
    renderer.setSize(window.innerWidth, window.innerHeight);    // renderer 사이즈 재설정
    renderer.render(scene, camera);                             // renderer 재설정
})

const render = () =>{
    renderer.render(scene, camera);
    requestAnimationFrame(render);
}

render();



