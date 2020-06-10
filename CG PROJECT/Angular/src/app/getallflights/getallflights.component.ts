import { Component, OnInit } from '@angular/core';
import { GetallflightsService } from '../getallflights.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-getallflights',
  templateUrl: './getallflights.component.html',
  styleUrls: ['./getallflights.component.css']
})
export class GetallflightsComponent implements OnInit {
  description: string;
  flights: Flight[];

  constructor(private auth: GetallflightsService, private router: Router) {
    this.viewflights();
   }
  viewflights() {
    this.auth.getallflights().subscribe(response => {
      console.log(response);
      this.flights = response.beans;
    }, err => {
      console.log(err);
    });
  }
  deleteflight(flight: Flight) {
    this.auth.deleteData(flight).subscribe(response => {
      console.log(response);
      if(response.statusCode === 201) {
        this.flights.splice(this.flights.indexOf(flight),1);
        this.description = response.discription;
      }
    });
  }
  deleteMessage() {
    this.description = null;
  }
  
  ngOnInit() {
  }

}
