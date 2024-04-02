import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Client } from './client';

@Injectable({
  providedIn: 'root'
})
export class ClientService {

  private baseURL = "http://localhost:8080/api/clients";
  /* injection (after adding Service to the model we add to the constructore variable HttpClient )  */
   constructor(private httpClient: HttpClient) { }
 
   getClientList(): Observable<Client[]> {
     return this.httpClient.get<Client[]>(this.baseURL);
   }
}
