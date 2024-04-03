import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ClientListComponent } from './components/client/client-list/client-list.component';
import { CreateClientComponent } from './components/client/create-client/create-client.component';

const routes: Routes = [
  {path: 'clients', component: ClientListComponent},
  {path: '', redirectTo: 'clients', pathMatch: 'full'},

  {path: 'create-client', component: CreateClientComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
