import React from 'react';

//function TestComponent(){
//    return <h1>HELLO from test component!</h1>
//}

const TestComponent = (props) =>{
    return (
        <div>
            <h1>HELLO from test component {props.name}!!</h1>
            {props.children}
        </div>
    );
}

export default TestComponent