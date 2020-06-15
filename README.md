Webapp with Create React App and Spring Boot
===

Developing Spring applications with Spring Boot is a real time saver. It gets you up and running quickly, and 
continues to make your life easier as you move to production and start releasing incremental updates to your
application. 

Create React App does the same thing for your React frontend. It speeds up the initial phase by stitching together
everything you need to get your React frontend working with minimal effort on your part, and it shortens your feedback
loop by enabling hot reload. That way, you can just save your files, and changes will be immediately visible in 
the browser. 

This tutorial shows you how to combine Create React App with Spring Boot, giving you one single jar file to deploy.

## Goal:
 - Easily deploy to test and production environments
 - Frontend and backend in a single jar
 - Keep the benefits using the Create React App environment including:
    - Hot reload
    - Built in ES6 to ES5 transpiler
    - Optimized production build

```java
package in.pnbc.springandreact;


fetch http://localhost:8008/api/hello with curl or your web browser: 

```
$ curl http://localhost:8008/api/hello


A spring boot application with a React frontend. During development, you can now run the application
using `React-scripts` by running `cd frontend; npm start`, and you'll have all the benefits of rapid application 
development with hot reloads and everything you might wish for, while being able to deploy the application to test
and production environments as a single artifact.