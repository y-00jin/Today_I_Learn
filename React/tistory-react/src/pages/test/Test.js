import { useEffect, useState } from 'react';
import axios from 'axios';

export default function Test() {
    const [test, setTest] = useState('test');

    useEffect(() => {
        axios.get(`${process.env.REACT_APP_API_URL}/api/tests`)
            .then(res => setTest(res.data.message))
    })
    return (
        <>{test}</>
    )
}