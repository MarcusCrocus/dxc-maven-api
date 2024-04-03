import { Component, OnInit } from '@angular/core';
import { Client } from '../../../client';
import { ClientService } from '../../../client.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-client',
  templateUrl: './create-client.component.html',
  styleUrl: './create-client.component.css'
})
export class CreateClientComponent implements OnInit {
  
client: Client = new Client();

  constructor(private clientService: ClientService,
    private router: Router) {}
  
  ngOnInit(): void {    

  }
  
  onSubmit(){
    console.log(this.client);
    this.saveClient();
  }

  //after submission of clients data we will redirect back to the client list
  saveClient(){ 
    this.clientService.createClient([this.client]).subscribe( data => {
      console.log(data);
      this.goToClientList();
    }, 
    error => console.log(error));
    
  }

  // redirection method
  goToClientList(){
    this.router.navigate(['/clients']);
  }
}
