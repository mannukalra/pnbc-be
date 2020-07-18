import React, {Component} from 'react';
import {Container, Button, Form, FormGroup, Label, Input } from "reactstrap";
import { TextInput } from 'carbon-components-react'

class Welcome extends Component{

   constructor(){
    super();
    this.state = {
        name:"",
        email:"",
        contactNum:null
    }
   }

   enquire = () => {
    console.log("inside connect");
    const requestOptions = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ name: this.state.name, mailId: this.state.email, mobileNumber: this.state.contactNum, message: "some ipsum lorem!" })
    };
    fetch('/api/enquire', requestOptions)
    .then(response => response)
    .then(function(response) {
            alert(JSON.stringify(response));
        })
    .catch(function(error) {
        console.log(error);
    });  
       
    // console.log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+this.state.resp);
   }

   onChangePhone = (event) => {
    this.setState({ contactNum: event.target.value });
   }
   onChangeName = (event) => {
    this.setState({ name: event.target.value });
   }
   onChangeEmail = (event) => {
    this.setState({ email: event.target.value });
   }
    render(){
        return (
            <Container fluid>
                <Label className="standard-carbon-input"> Get a free estimate </Label><br /><br />
                <Form>
                    <FormGroup>
                    <Label>Your Name</Label>
                    <TextInput style={{ width: "20%", marginTop: "10px"}}
                        onChange={(e) => { this.onChangeName(e) }}
                        value={this.state.name}
                        placeholder="your name"
                    />
                    <br />
                    </FormGroup>
                    <FormGroup>
                    <Label>YOUR EMAIL</Label>
                    <TextInput style={{ width: "20%", marginTop: "10px"}}
                        onChange={(e) => { this.onChangeEmail(e) }}
                        value={this.state.email}
                        placeholder="your email address"
                    />
                    <br />
                    </FormGroup>
                    <FormGroup>
                    <Label>YOUR PHONE</Label>
                    <TextInput style={{ width: "20%", marginTop: "10px"}}
                        onChange={(e) => { this.onChangePhone(e) }}
                        value={this.state.contactNum}
                        placeholder="your phone number"
                    />
                    <br />
                    </FormGroup>
                    <Button onClick={this.enquire}>Enquire</Button>
                    </Form>
            </Container>
        );
    }
}

export default Welcome