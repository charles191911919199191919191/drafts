function validateLogin() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    var errorUsername = document.getElementById("error-username");
    var errorPassword = document.getElementById("error-password");
  
    // Replace these values with your actual username and password
    var correctUsername = "Charles";
    var correctPassword = "password123";
  
    errorUsername.innerHTML = "";
    errorPassword.innerHTML = "";
  
    if (username !== correctUsername) {
      errorUsername.innerHTML = "Incorrect username";
    }
  
    if (password !== correctPassword) {
      errorPassword.innerHTML = "Incorrect password";
    }
  
    if (username === correctUsername && password === correctPassword) {
      alert("Welcome to our page " + username);
    }
  }
  