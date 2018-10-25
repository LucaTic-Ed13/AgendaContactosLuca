import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { ContactoEditComponent } from './contacto-edit/contacto-edit.component';
import { ContactoListComponent } from './contacto-list/contacto-list.component';
import { ContactoListV2Component } from './contacto-list-v2/contacto-list-v2.component';


const appRoutes: Routes =  [
  {
    path: '',
    redirectTo: '/contacto-list',
    pathMatch: 'full'
  },
  {
    path: 'contacto-list',
    component: ContactoListV2Component
  },
  {
    path: 'contacto-add',
    component: ContactoEditComponent
  },
  {
    path: 'contacto-edit/:id',
    component: ContactoEditComponent
  }
];

@NgModule({
  declarations: [
    AppComponent,
    ContactoEditComponent,
    ContactoListComponent,
    ContactoListV2Component
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent] 
})
export class AppModule { }
