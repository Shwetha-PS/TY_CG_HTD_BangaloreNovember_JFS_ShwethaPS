import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { GetallflightsService } from '../getallflights.service';

@Component({
  selector: 'app-updateflight',
  templateUrl: './updateflight.component.html',
  styleUrls: ['./updateflight.component.css']
})
export class UpdateflightComponent implements OnInit {
message: any;
  constructor(private auth: GetallflightsService, private router: Router) {
    
   }
  updateflight(form: NgForm) {
    console.log(form.value);
    this.auth.updateData(form.value).subscribe(response => {
      console.log(response);
      this.message =  response.message;
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
