import type { InferGetServerSidePropsType, GetServerSideProps } from 'next'

export const getServerSideProps = (async () => {
    const num = await fetch('https://www.random.org/integers/?num=1&min=1&max=100&col=1&base=10&format=plain')
    const number: number = await num.json()
    return { props: { number } }
}) satisfies GetServerSideProps<{ number: number }>

export default function Page({
    number,
}: InferGetServerSidePropsType<typeof getServerSideProps>) {
    return (

        <div>
            <h1>GetServerSideProps</h1>
            <h2>number: {number}</h2>
        </div>

    )
}