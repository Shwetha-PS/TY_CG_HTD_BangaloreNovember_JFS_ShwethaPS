import { Component, OnInit } from '@angular/core';
import { AddflightService } from '../addflight.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-addflight',
  templateUrl: './addflight.component.html',
  styleUrls: ['./addflight.component.css']
})
export class AddflightComponent implements OnInit {
  message: any;
  error: any;
  constructor(private auth: AddflightService, private router: Router) { }
  add(form: NgForm) {
    this.auth.add(form.value).subscribe(response => {
      console.log(response);
      this.message = response.message;
      setTimeout(() => {
        this.message = null;
      }, 2000);
      form.reset();
    }, err => {
      console.log(err);
      this.message = err.message;
      setTimeout(() => {
        this.message = null;
      }, 2000);
    });
  }
  ngOnInit() {
  }

}
