//We will be using some script to validate login.. I do not have this hooked to
//a MYSQL database yet but will do so in the future
//Essentially we will create an array for usernames and there associated password if they
//match we will load homepage.html

$(document).ready(function () {
    document.getElementById("login-button").addEventListener("click", function () {


        var user = document.getElementById("userName-login").value;
        var pwd = document.getElementById("password-login").value;
        
        console.log(user);
        console.log(pwd);
        

        var authentication = [{
            username: "zakdourden",
            password: "derp"
   }];
        
        console.log(authentication[0].username);
        console.log(authentication[0].password);
        

        if (user.value == authentication[0].username.value && pwd.value == authentication[0].password.value) {
            window.location.href = "../app/homePage.html";
        }

    });
});
