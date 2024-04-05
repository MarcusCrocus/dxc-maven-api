import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Client } from './client';

@Injectable({
  providedIn: 'root',
})
export class ClientService {
  private baseURL = 'http://localhost:8080/api/clients';
  /* injection (after adding Service to the model we add to the constructore variable HttpClient )  */
  constructor(private httpClient: HttpClient) {}

  // Show clients list from Database
  getClientList(): Observable<Client[]> {
    return this.httpClient.get<Client[]>(this.baseURL);
  }

  // save client from the form (remember that we use the same post in array of obj)
  createClient(client: Client[]): Observable<Object> {
    return this.httpClient.post(`${this.baseURL}`, client);
  }

  // get clientID from the form
  getClientById(clientId: number): Observable<Client> {
    return this.httpClient.get<Client>(`${this.baseURL}/${clientId}`);
  }
  // update client from the form
  updateClient(clientId: number, client: Client): Observable<Object> {
    return this.httpClient.post(`${this.baseURL}/${clientId}`, client);
  }
  removeClient(clientId: number): Observable<Object> {
    return this.httpClient.delete(`${this.baseURL}/${clientId}`);
  }
}
