const express = require('express');
const queries = require('./src/db/queries'); // queries.js 파일 전체를 가져옴
const path = require('path');
const app = express();

const port = 8008; // 포트 설정

// CORS 사용
const cors = require('cors');
const corsOption = {
    origin: "*",
    optionSuccessStatus: 200,
};
app.use(cors(corsOption));
app.use(express.json());

app.get('/api/tests', async (req, res) => {
    try {
        const tests = await queries.getTests(); // queries 객체를 통해 getTests 함수를 호출하여 테스트 목록을 가져옴
        res.status(200).json(tests); // 목록을 JSON 형식으로 응답
    } catch (error) {
        res.status(500).json({ error: 'Internal server error' }); // 오류 발생 시 500 에러 응답
    }
});

// 정적 파일 미들웨어 설정
app.use(express.static(path.join(__dirname, '/build')));

// 모든 요청에 대해 index.html 제공
app.get('*', (req, res) => {
    res.sendFile(path.join(__dirname, '/build', 'index.html'));
});

// 서버 확인
app.listen(port, () => {
    console.log('server is running on ' + port);
});