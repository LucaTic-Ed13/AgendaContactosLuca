import { Component, OnInit } from '@angular/core';
import { ContactoService } from '../shared';



@Component({
  selector: 'app-contacto-list',
  templateUrl: './contacto-list.component.html',
  styleUrls: ['./contacto-list.component.css'],
  providers: [ContactoService]
})

export class ContactoListComponent implements OnInit {
  contactos: Array<any>;
  constructor(private contactoService: ContactoService){}

  ngOnInit() {
    this.contactoService.getAll().subscribe(
      data => {
        this.contactos = data;
      },
      error => console.log(error)
    )
  }
}





