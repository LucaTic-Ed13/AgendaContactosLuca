import { Component, OnInit } from '@angular/core';
import { ContactoEditService } from '../shared/contacto-edit/contacto-edit.service';
import { ContactoService } from '../shared/contacto/contacto.service';

@Component({
  selector: 'app-contacto-list-v2',
  templateUrl: './contacto-list-v2.component.html',
  styleUrls: ['./contacto-list-v2.component.css'],
  providers: [ContactoService, ContactoEditService]

})
export class ContactoListV2Component implements OnInit {

  contactos: Array<any>;
  
  constructor(private contactoService, private contactoEditService: ContactoEditService) { }

  ngOnInit() {
        //Implementa un patron Observer
    //El metodo getAll está definido en beer.service.ts
    this.contactoService.getAll().subscribe(
      data => {
        this.contactos = data;
      },
      error => console.log(error)
    )
  }

}
