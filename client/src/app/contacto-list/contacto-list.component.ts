import { Component, OnInit } from '@angular/core';
import { ContactoService, GiphyService } from '../shared';



@Component({
  selector: 'app-contacto-list',
  templateUrl: './contacto-list.component.html',
  styleUrls: ['./contacto-list.component.css'],
  providers: [ContactoService, GiphyService]
})

export class ContactoListComponent implements OnInit {
  contactos: Array<any>;

  constructor(private contactoService: ContactoService, private giphyService: GiphyService) { }

  ngOnInit() {
    //Implementa un patron Observer
    //El metodo getAll está definido en beer.service.ts
    this.contactoService.getAll().subscribe(
      data => {
        this.contactos = data;
        //Con lo anterior bastaría. Ya se podrían ver las cervezas en el Front
        //   pero si quiero añadir una iamgen a cada nombre uso un nuevo servicio
        //Con este bucle añado una imagen a cada cerveza
        for (const contacto of this.contactos) {
          this.giphyService.get(contacto.name).subscribe(url => contacto.giphyUrl = url);
        }
      },
      error => console.log(error)
    )
  }
}




