import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs/Subscription';
import { ActivatedRoute, Router } from '@angular/router';
import { ContactoService } from '../shared';
import { ContactoEditService } from '../shared';
import { GiphyService } from '../shared';
import { NgForm } from '@angular/forms';


@Component({
  selector: 'app-contacto-edit',
  templateUrl: './contacto-edit.component.html',
  styleUrls: ['./contacto-edit.component.css'],
  providers: [ContactoService, ContactoEditService, GiphyService]
})

export class ContactoEditComponent implements OnInit, OnDestroy {
  contacto: any = {};

  sub: Subscription;

  constructor(private route: ActivatedRoute,
              private router: Router,
              private contactoService: ContactoService,
              private contactoEditService: ContactoEditService,              
              private giphyService: GiphyService) {
  }

  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      const id = params['id'];
      if (id) {
        this.contactoEditService.get(id).subscribe((contacto: any) => {
          if (contacto) {
            this.contacto = contacto;
            this.contacto.href = contacto._links.self.href;
            this.giphyService.get(contacto.name).subscribe(url => contacto.giphyUrl = url);
          } else {
            console.log(`Contacto with id '${id}' not found, returning to list`);
            this.gotoList();
          }
        });
      }
    });
  }

  ngOnDestroy() {
    this.sub.unsubscribe();
  }

  gotoList() {
    this.router.navigate(['/contacto-list']);
  }

  save(form: NgForm) {
    this.contactoEditService.save(form).subscribe(result => {
      this.gotoList();
    }, error => console.error(error));
  }

  remove(href) {
    this.contactoEditService.remove(href).subscribe(result => {
      this.gotoList();
    }, error => console.error(error));
  }
}
