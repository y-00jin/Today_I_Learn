const { Pool } = require('pg');

const pool = new Pool({
  user: 'postgres',
  host: 'localhost',
  database: 'postgres',
  password: '1234',
  port: 5432, // PostgreSQL 기본 포트
});



pool.connect(err => {
    if(err) console.log(err);
    else console.log('성공');
});
module.exports = pool;
