import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable()

export class ContactoEditService {
  public API = '//localhost:8080';
  public CONTACTO_API = this.API + '/contactos';

  constructor(private http: HttpClient) { }

    // Método JPA Repository: Método  getOne(ID id)
    get(id: string) {
      return this.http.get(this.CONTACTO_API + '/' + id);
    }

      // Método JPA Repository: Método saveAndFlush(S entity)
  save(contacto: any): Observable<any> {
    let result: Observable<Object>;
    if (contacto['href']) {
      result = this.http.put(contacto.href, contacto);
    } else {
      result = this.http.post(this.CONTACTO_API, contacto);
    }
    return result;
  }

    // Método JPA Repository: Método deleteInBatch(Iterable<T> entities)
    remove(href: string) {
      return this.http.delete(href);
    }
}
