const pool = require('./dbConfig');

const getTests = async () => {

    try {
        const tests = await pool.query('SELECT * FROM test');
        return tests.rows;
      } catch (error) {
        throw error;
      }
};


module.exports = {
    getTests
};