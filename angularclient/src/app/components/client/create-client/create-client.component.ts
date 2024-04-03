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

  constructor() {}
  
  ngOnInit(): void {    

  }
  
  onSubmit(){
    console.log(this.client);
    
  }
}
