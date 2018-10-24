import { TestBed } from '@angular/core/testing';

import { ContactoEditService } from './contacto-edit.service';

describe('ContactoEditService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ContactoEditService = TestBed.get(ContactoEditService);
    expect(service).toBeTruthy();
  });
});
