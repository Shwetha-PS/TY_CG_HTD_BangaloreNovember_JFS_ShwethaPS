import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { AuthenticationService } from '../authentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
error:any;
message:any;
  constructor(private auth: AuthenticationService, private router:Router) { }

  login(form: NgForm) {
    this.auth.loginUser(form.value).subscribe(response => {
    if(response.statusCode == 201){
      console.log(response);
      localStorage.setItem('userdetails',JSON.stringify(response));
      console.log("user details are stored");
      this.message = response.message;
      this.router.navigateByUrl('/');
      form.reset();
    }
    else{
      this.message = response.message;
      console.log(this.message);
    }
  });
}
  ngOnInit() {
  }

}
