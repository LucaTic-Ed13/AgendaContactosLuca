import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable()

export class ContactoService {
  public API = '//localhost:8080';
  public CONTACTO_API = this.API + '/contactos';

  constructor(private http: HttpClient) {}

  // LISTADO
  getAll(): Observable<any> {
    return this.http.get(this.API);
  }
}

