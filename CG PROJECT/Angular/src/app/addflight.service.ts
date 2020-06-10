import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AddflightService {
  url = 'http://localhost:8080';

  constructor(private http: HttpClient) { }
  add(Flight): Observable<any> {
    return this.http.post<any>(`${this.url}/add-flight`, Flight);
  }
}
