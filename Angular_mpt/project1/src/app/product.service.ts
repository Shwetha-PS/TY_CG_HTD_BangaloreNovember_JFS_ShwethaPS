import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  selectedProduct: Product;

  apiUrl = 'http://localhost:8080';
  constructor(private http: HttpClient) { }

  postData(product): Observable<any> {
    return this.http.post<any>(`${this.apiUrl}/add-product`, product);
  }

  getData(): Observable<any> {
    return this.http.get<any>(`${this.apiUrl}/view-allproducts`);
  }

  deleteData(product: Product): Observable<any> {
    return this.http.delete<any>(`${this.apiUrl}/delete-product/${product.id}`);
  }

  updateData(product): Observable<any> {
    return this.http.put<any>(`${this.apiUrl}/modify-product`, product);
  }

}
