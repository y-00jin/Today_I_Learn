const express = require('express');
const path = require('path');
const app = express();

const port = process.env.PORT || 8088; // 포트 설정

// CORS 사용
const cors = require('cors');
const corsOption = {
    origin: "*",
    optionSuccessStatus: 200,
};
app.use(cors(corsOption));

// API로 요청한 경우 hello 메시지를 보내는 콜백 함수를 넣습니다.
app.get('/api', (req,res) => {
  res.send({message:'hello'});
});


// 정적 파일 미들웨어 설정
app.use(express.static(path.join(__dirname, '/build')));

// 모든 요청에 대해 index.html 제공
app.get('*', (req, res) => {
  res.sendFile(path.join(__dirname, '/build', 'index.html'));
});

// 서버 확인
app.listen(port, ()=>{
  console.log('server is running on ' + port);
});

  
