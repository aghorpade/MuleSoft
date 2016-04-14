
1. run application on  9090 port with below sample example :

 http://localhost:9090/load  - POST  content-type : application/json
 {
"firstname":"abc",
"lastname":"xyz"
}


It will convert Json data into User Object -(autodetection is present on User Object) and Java Component have business logic

It will create new UserDTO object with input from User Object and return back new UserDTO object

Object to Json transformer will convert response into json.


