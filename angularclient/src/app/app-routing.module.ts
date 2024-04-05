import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ClientListComponent } from './components/client/client-list/client-list.component';
import { CreateClientComponent } from './components/client/create-client/create-client.component';
import { UpdateClientComponent } from './components/client/update-client/update-client.component';

const routes: Routes = [
  { path: 'clients', component: ClientListComponent },
  { path: '', redirectTo: 'clients', pathMatch: 'full' },

  { path: 'create-client', component: CreateClientComponent },
  { path: 'update-client/:clientId', component: UpdateClientComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
