import { Component, OnInit } from '@angular/core';
import { ContactoService, ContactoEditService, GiphyService } from '../shared';

@Component({
  selector: 'app-contacto-list-v2',
  templateUrl: './contacto-list-v2.component.html',
  styleUrls: ['./contacto-list-v2.component.css'],
  providers: [ContactoService, ContactoEditService, GiphyService]

})
export class ContactoListV2Component implements OnInit {

  contactos: Array<any>;
  
<<<<<<< HEAD
  constructor(private contactoService: ContactoService, private contactoEditService: ContactoEditService, private giphyService: GiphyService) { }
=======
  constructor(private contactoService:ContactoService, private contactoEditService: ContactoEditService, private giphyService: GiphyService) { }
>>>>>>> 396807b46847ba2acea78a0eaaa5810b40ac1090

  ngOnInit() {
        //Implementa un patron Observer
    //El metodo getAll está definido en beer.service.ts
    this.contactoService.getAll().subscribe(
      data => {
        this.contactos = data;

        for (const contacto of this.contactos) {
          this.giphyService.get(contacto.name).subscribe(url => contacto.giphyUrl = url);
        }
      },
      error => console.log(error)
    )
  }

}
