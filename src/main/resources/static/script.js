/**
 * 
 */

function validateInfo(){
	var first = document.getElementById("firstname").value;
	if (first.length <=2){
		alert("Please enter a longer first name!");
		document.getElementById("firstname").focus();
		return false;
	}
	
	var last = document.getElementById("lastname").value;
	if (last.length <=2){
		alert("Please enter a longer last name!");
		document.getElementById("lastname").focus();
		return false;
}
	var phone= document.getElementById("phonenumber").value
	var pattern = /^\d{10}$/;
    if (pattern.test(phone) == false) {
         alert("Please enter a valid 10 digit phone number");
        return false;
	}
    
    var password = document.getElementById("pass").value;
	if (password.length <=6){
		alert("Password must be at least 6 characters");
		document.getElementById("pass").focus();
		return false;
	}
}
    
//    var email = document.getElementById("email").value
//    var pattern = /\S+@\S+/;
//    if (pattern.test(email)) == false {
//    	alert("Please enter a valid email address")
//    	return false;
//    }
    


