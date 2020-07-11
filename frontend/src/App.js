import React, { Component, useState, useEffect } from 'react';
import PhoneIcon from '@material-ui/icons/Phone';
import logo from './logo-actual.svg';
import bg1 from './img/bg1.jpg';
import bg2 from './img/bg2.jpg';
import './App.css';
import TestComponent from './components/TestComponent';
import Welcome from './components/Welcome';
import { Container, Row, Col } from "reactstrap";
import {Button} from 'react-bootstrap';
import { Table } from '@material-ui/core';


function App() {
    const [message, setMessage] = useState("");

    useEffect(() => {
        fetch('/api/hello')
            .then(response => response.text())
            .then(message => {
                setMessage(message);
            });
    }, [])
    return (
        <div style={{ backgroundImage: `url(${bg1})` }}>
            <header>
                <Container style={{ display: "grid" }}>
                    <div style={{ marginLeft: "12rem", marginTop: "1rem", color: "#34cceb", fontSize: "small" }}>
                        <PhoneIcon style={{ color: "#34cceb", fontSize: "1rem" }}></PhoneIcon>
                        <b>&nbsp;&nbsp;&nbsp;CALL (773) 634-9078</b>
                    </div>
                </Container>
            </header>
            <div style={{ display: "flex", justifyContent: "center" }}>
                <div style={{
                    width: "82%", marginleft: "auto", marginTop: "1rem", backgroundImage: `url(${bg2})`,
                    boxShadow: "0 4px 8px 0 rgba(0, 0, 0, 0.5), 0 6px 20px 0 rgba(0, 0, 0, 0.5)"}}>
                    <Container fluid style={{ backgroundColor: "#074193", height: "6rem" }}>
                        <Row noGutters style={{width:"100%", marginLeft:"28px"}}>
                            <Col lg="2" md="3" sm="3" xs="3">
                                <img src={logo} alt="logo" style={{ height: "54px", width: "112px", marginTop: "21px" }} />
                            </Col>
                            <Col lg="10" md="9" sm="9" xs="9">
                                <Button variant="primary">HOME</Button>{' '}
                            </Col>
                        </Row>
                    </Container>
                   
                    <TestComponent name="testName">
                        <h1 className="App-title">{message}</h1>
                    </TestComponent>
                    <Welcome />
                </div>
            </div>
        </div>

    )
}

export default App;
