import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Client } from './client';

@Injectable({
  providedIn: 'root'
})
export class ClientService {

  private baseURL = "http://localhost:8080/api/clients";
  /* injection (after adding Service to the model we add to the constructor variable HttpClient )  */
   constructor(private httpClient: HttpClient) { }
 
   // Show clients list from Database
   getClientList(): Observable<Client[]> {
     return this.httpClient.get<Client[]>(this.baseURL);
   }

   // save client from the form (remember that we use the same post in array of obj)
   createClient(client: Client[]): Observable<Object> {
    return this.httpClient.post(`${this.baseURL}`, client);
   }
}
