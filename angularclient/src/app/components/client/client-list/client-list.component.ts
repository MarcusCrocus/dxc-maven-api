import { Component, OnInit } from '@angular/core';
import { Client } from '../../../client';

@Component({
  selector: 'app-client-list',
  templateUrl: './client-list.component.html',
  styleUrl: './client-list.component.css'
})
export class ClientListComponent implements OnInit{
 
  clients: Client[] = [];
//adding dummy data to test
  ngOnInit() : void{
    this.clients = [
    {
      "clientId": 1,
      "surname": "Travolta",
      "age": 25,
      "name": "John",
      "isClient": true
    },
    {
      "clientId": 2,
      "surname": "Smith",
      "age": 30,
      "name": "Will",
      "isClient": true
    },
    {
      "clientId": 3,
      "surname": "Johnson",
      "age": 40,
      "name": "Michael",
      "isClient": false
    },
    {
      "clientId": 4,
      "surname": "Brown",
      "age": 35,
      "name": "Emily",
      "isClient": true
    },
    {
      "clientId": 5,
      "surname": "Wilson",
      "age": 28,
      "name": "Sirena",
      "isClient": false
    },
    {
      "clientId": 6,
      "surname": "Taylor",
      "age": 45,
      "name": "Swift",
      "isClient": true
    },
    {
      "clientId": 7,
      "surname": "Milo",
      "age": 32,
      "name": "Olivia",
      "isClient": true
    },
    {
      "clientId": 8,
      "surname": "Brown",
      "age": 29,
      "name": "James",
      "isClient": false
    },
    {
      "clientId": 9,
      "surname": "Whats",
      "age": 38,
      "name": "Emma",
      "isClient": true
    },
    {
      "clientId": 10,
      "surname": "Eniston",
      "age": 27,
      "name": "Jennifer",
      "isClient": true
    }];
  }
}