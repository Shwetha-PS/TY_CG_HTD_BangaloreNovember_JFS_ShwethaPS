import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GetallflightsService {
  url = 'http://localhost:8080';

  constructor(private http: HttpClient) { }
  getallflights(): Observable<any> {
    return this.http.get<any>(`${this.url}/getall-flight`);
  }
 
  deleteData(flight: Flight): Observable<any> {
      return this.http.delete<any>(`${this.url}/delete-flight/${flight.flightNumber}`);
  }

updateData(flight): Observable<any> {
  return this.http.put<any>(`${this.url}/modify-flight`, flight);
}
}
