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


// Mesh 오브젝트 생성
const geometry = new THREE.BoxGeometry(1,1,1);                  // 박스 오브젝트 생성
const material = new THREE.MeshStandardMaterial({color:0xff0000})  // StandardMaterial : 빛 필수(빛이 존재하지 않으면 보이지 않음)
// const material = new THREE.MeshBasicMaterial({color:0xff0000})  // 기본 오브젝트 스타일
const mesh = new THREE.Mesh(geometry, material);                // Mesh 오브젝트 생성
mesh.castShadow = true;     // 그림자 생성
mesh.position.y = 0.5;
scene.add(mesh);    // 생성한 오브젝트를 scene에 추가

// 캡슐 오브젝트 생성
const capsuleGeometry = new THREE.CapsuleGeometry(1, 2, 20, 30);
const capsuleMaterial = new THREE.MeshStandardMaterial({color:0xffff00});
const capsuleMesh = new THREE.Mesh(capsuleGeometry, capsuleMaterial );
capsuleMesh.position.set(3, 1.75, 0);   // 위치 변경
capsuleMesh.receiveShadow = true;       // 그림자 받음
capsuleMesh.castShadow = true;          // 그림자 생성
scene.add(capsuleMesh);


// 원기둥 오브젝트 생성
const cylinderGeometry = new THREE.CylinderGeometry(1, 1, 2);
const cylinderMaterial = new THREE.MeshStandardMaterial({color:0x00ff00});
const cylinderMesh = new THREE.Mesh(cylinderGeometry, cylinderMaterial);
cylinderMesh.position.set(-3,1,0);  // 위치 변경
cylinderMesh.castShadow = true;      // 그림자 생성
cylinderMesh.receiveShadow = true;   // 그림자 받음
scene.add(cylinderMesh);

// 도넛 오브젝트 생성
const torusGeometry = new THREE.TorusGeometry(0.5, 0.1, 16, 100);
const torusMaterial = new THREE.MeshStandardMaterial({color:0x0000ff});
const torusMesh = new THREE.Mesh(torusGeometry, torusMaterial);
torusMesh.position.set(0, 0.5, 1);  // 위치
torusMesh.castShadow = true;        // 그림자 생성
torusMesh.receiveShadow = true;     // 그림자 받음
scene.add(torusMesh);

// 별모양 오브젝트 생성
const starShape = new THREE.Shape();
starShape.moveTo(0,1);          // moveTo로 시작점을 잡고
starShape.lineTo(0.2, 0.2);     // lineTo로 다음 지점을 지정하면 그 지점까지 선을 그려줌
starShape.lineTo(1, 0.2);
starShape.lineTo(0.4, -0.1);
starShape.lineTo(0.6, -1);
starShape.lineTo(0, -0.5);
starShape.lineTo(-0.6, -1);
starShape.lineTo(-0.4, -0.1);
starShape.lineTo(-1, 0.2);
starShape.lineTo(-0.2, 0.2);

const shapeGeometry = new THREE.ShapeGeometry(starShape);
const shapeMaterial = new THREE.MeshStandardMaterial({color:0xff00ff});
const shapeMesh = new THREE.Mesh(shapeGeometry, shapeMaterial);
shapeMesh.position.set(0, 1, 2);
scene.add(shapeMesh);

// 별모양 3D 오브젝트 생성
const extrudeSettings = {
    steps: 1,               // 부드러운 형태 설정(값이 클수록 매끄러움)
    depth: 0.1,             // 입체의 두께
    bevelEnabled: true,     // 모서리 둥글기 여부
    bevelThickenss: 0.1,    // 모서리 두께
    bevelSize: 0.3,         // 모서리 크기
    bevelSegments: 100,     // 모서리 매끄러움 설정
};
const extrudGeometry = new THREE.ExtrudeGeometry(starShape, extrudeSettings);
const extrudeMaterial = new THREE.MeshStandardMaterial({color:0x0ddaaf});
const extrudeMesh = new THREE.Mesh(extrudGeometry, extrudeMaterial);
extrudeMesh.position.set(2, 1.3, 2);
extrudeMesh.castShadow = true;
extrudeMesh.receiveShadow = true;
scene.add(extrudeMesh);

// 구모양 오브젝트
const sphereGeometry = new THREE.SphereGeometry(1, 32, 32);
const spherMaterial = new THREE.MeshStandardMaterial({color:0x98daaf});
const spherMesh = new THREE.Mesh(sphereGeometry, spherMaterial);
spherMesh.position.set(0, 1, -3);
scene.add(spherMesh);

// Point(점) 형태로 Geometry 오브젝트 생성
const numPoints = 1000;     // 포인트 수
const positions = new Float32Array(numPoints * 3);  // x, y, z => 3개 필요하므로 * 3
// 배열에 각 x,y,z 좌표를 랜덤으로 추가
for(let i=0;i<numPoints;i++){
    const x = (Math.random() - 0.5) * 1;
    const y = (Math.random() - 0.5) * 1;
    const z = (Math.random() - 0.5) * 1;

    positions[i*3] = x;
    positions[i*3 + 1] = y;
    positions[i*3 + 2] = z;
}
const bufferGeometry = new THREE.BufferGeometry();  // 렌더러에 효율적
bufferGeometry.setAttribute(
    "position",
    new THREE.BufferAttribute(positions, 3)
);
const pointsMaterial = new THREE.PointsMaterial({color:0xffff00, size:0.05});
const point = new THREE.Points(bufferGeometry, pointsMaterial);
point.position.set(0, 0, -5);
scene.add(point);


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



