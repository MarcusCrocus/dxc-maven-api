import { Component, OnInit } from '@angular/core';
import { Client } from '../../../client';
import { ClientService } from '../../../client.service';

@Component({
  selector: 'app-client-list',
  templateUrl: './client-list.component.html',
  styleUrl: './client-list.component.css'
})
export class ClientListComponent implements OnInit{
 
  clients: Client[] = [];

  constructor(private clientService: ClientService){}
  ngOnInit(): void {
    this.getClients();
  }

  // Esta función se encarga de obtener la lista de clientes desde una API y 
  // manejar tanto las respuestas exitosas como los errores que puedan ocurrir 
  
  // durante el proceso. Si la respuesta de la solicitud es válida y contiene 
  // datos en un formato esperado (tenemos un formato de un Array of Objects), 
  // se asigna el array de clientes a la variable clients. En caso contrario, 
  // se imprime un mensaje de error en la consola indicando que la estructura 
  // de la respuesta es incorrecta.

  private getClients(): void {
    this.clientService.getClientList().subscribe(
      (response: any) => {
        console.log('Response from API:', response);
        if (response && response.data && Array.isArray(response.data)) {
          this.clients = response.data;
        } else {
          console.error('Invalid response format:', response);
        }
      },
      (error) => {
        console.error('Error fetching client list:', error);
      }
    );
  }
}