import { ActivatedRoute, Router } from '@angular/router';
import { Client } from '../../../client';
import { ClientService } from './../../../client.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-update-client',
  templateUrl: './update-client.component.html',
  styleUrl: './update-client.component.css'
})
export class UpdateClientComponent implements OnInit {
  clientId: number = 0;
  client: Client = new Client();

  constructor(
    private clientService: ClientService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.clientId = this.route.snapshot.params['clientId']; // getting id from particular client route

    // call service to get client data by id
    this.clientService.getClientById(this.clientId).subscribe(
      (data: Client) => {
        console.log(data);
        this.client = data;
      },
      (error) => console.log(error)
    );
  }

  updateClient() {
    this.clientService.updateClient(this.clientId, this.client).subscribe(
      (data) => {
        console.log(data);
        this.goToClientList();
      },
      (err) => console.log(err)
    );
  }

  onSubmit() {
    this.clientService.updateClient(this.clientId, this.client).subscribe(
      (data) => {
        this.goToClientList();
      },
      (err) => console.log(err)
    ); // sending client form
  }

  goToClientList() {
    this.router.navigate(['/clients']); //go back to the clientList
  }
}
