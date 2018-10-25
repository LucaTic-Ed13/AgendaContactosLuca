import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ContactoListV2Component } from './contacto-list-v2.component';

describe('ContactoListV2Component', () => {
  let component: ContactoListV2Component;
  let fixture: ComponentFixture<ContactoListV2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ContactoListV2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ContactoListV2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
