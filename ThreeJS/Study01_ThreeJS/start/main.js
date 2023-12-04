import * as THREE from 'three';
import {OrbitControls} from 'orbitControls';

// 카메라 설정
const camera = new THREE.PerspectiveCamera( 75, window.innerWidth / window.innerHeight, 0.1, 1000 );
camera.position.z = 5;		// 카메라 z 값 설정

// randerer(배경) 생성
const renderer = new THREE.WebGLRenderer();
renderer.setSize( window.innerWidth, window.innerHeight );
// document.body.appendChild( renderer.domElement );					// body에 추가
// document.getElementById("test").appendChild(renderer.domElement);	// div id값에 추가
$("#threeDiv").append(renderer.domElement);		// jqeury로 div id값에 추가

// 장면(모델) 생성
const scene = new THREE.Scene();

// Object
const geometry = new THREE.BoxGeometry( 1, 1, 1 );		// 정육면체 박스 오브젝트 생성

/**
 * ## 이미지 텍스쳐 meterial에 추가
 */
// const loader = new THREE.TextureLoader();
// const material = new THREE.MeshBasicMaterial({
//     map: loader.load("1.png", undefined, undefined, function(err) {
//         alert('Error');
//     }),
// });

const material = new THREE.MeshBasicMaterial( { color: 0xFFA7A7 } );	// 오브젝스 스타일 (색상) 변경
const cube = new THREE.Mesh( geometry, material );	// 정육면체와 스타일 적용
scene.add( cube );	// 장면에 오브젝트 추가

// 화면 클릭 전환
const controls = new OrbitControls(camera, renderer.domElement);
controls.update();

function animate() {
	requestAnimationFrame( animate );

	// 큐브 애니메이션 추가
	cube.rotation.x += 0.01;
	cube.rotation.y += 0.02;

	renderer.render( scene, camera );
}
animate();

