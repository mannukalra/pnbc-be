import React, {Component} from 'react';
import {Container, Button, Form, FormGroup, Label, Input } from "reactstrap";

class Welcome extends Component{

   constructor(){
    super();
    this.state = {
        name:"",
        email:"",
        contactNum:null
    }
   }

   connect(){
    console.log("inside connect");
   }

    render(){
        return (<div>
            <Container fluid>
                <Form>
                    <FormGroup>
                        <Label>Username</Label>
                        <Input type="text"></Input>
                    </FormGroup>
                    <FormGroup>
                        <Label>Email</Label>
                        <Input type="text"></Input>
                    </FormGroup>
                    <FormGroup>
                        <Label>Phone Number</Label>
                        <Input type="text"></Input>
                    </FormGroup>
                    <Button onClick={this.connect()}>Connect</Button>
                </Form>
            </Container>
        </div>);
    }
}

export default Welcome