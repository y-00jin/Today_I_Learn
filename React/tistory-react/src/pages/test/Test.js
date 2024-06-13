import { useEffect, useState } from 'react';
import axios from 'axios';

export default function Test() {
    const [tests, setTests] = useState([]);

    useEffect(() => {
        axios.get(`${process.env.REACT_APP_API_URL}/api/tests`)
            .then(res => {
                setTests(res.data);
            })
    }, [])

    return (
        <>
            {tests.map(data => {
                return <h1 key={data.test_seq_no}>{data.test_nm}</h1>
            }
            )}
        </>
    )
}