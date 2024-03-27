export default function TestNew() {

    const test = (e) => {

        fetch("http://localhost:8088/tests/add", {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json' // 데이터의 형식을 JSON으로 지정
            },
            body: JSON.stringify({
                testName: e.target.value // 새로운 테스트의 이름을 지정
            })
        })
            .then(res => res.json())
            .then(data => {
                alert(data.message);
            })


    }
    return (

        <>
            <button onClick={test} value="ㅎㅎㅎ">test</button>
        </>
    )
}