const express = require('express');
const queries = require('./src/db/queries'); // queries.js 파일 전체를 가져옴
const path = require('path');
const cors = require('cors');

const app = express();
const port = process.env.PORT || 8008; // 포트 설정

// CORS 사용
const corsOption = {
    origin: "*",
    optionSuccessStatus: 200,
};
app.use(cors(corsOption));
app.use(express.json());

// API : /api/tests
app.get('/api/tests', async (req, res) => {
    try {
        const tests = await queries.getTests(); // queries 객체를 통해 getTests 함수를 호출하여 데이터 목록을 가져옴
        res.status(200).json(tests); // 목록을 JSON 형식으로 응답
    } catch (error) {
        res.status(500).json({ error: 'Internal server error' }); // 오류 발생 시 500 에러 응답
    }
});

// 정적 파일 제공 (리액트 build 결과물)
app.use(express.static(path.join(__dirname, '/build')));

// 그 외 모든 요청은 index.html 반환
app.get('*', (req, res) => {
    res.sendFile(path.join(__dirname, '/build', 'index.html'));
});

// 서버 실행
app.listen(port, () => {
    console.log('server is running on ' + port);
});