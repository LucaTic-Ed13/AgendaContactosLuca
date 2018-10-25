import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable()

export class ContactoService {
  public API = 'http://www.mocky.io/v2';
  public CONTACTO_API = this.API + '/5bd21dc62f00002c33d8ff56';

  constructor(private http: HttpClient) {}

  // LISTADO
  getAll(): Observable<any> {
    return this.http.get(this.CONTACTO_API);
  }
}

