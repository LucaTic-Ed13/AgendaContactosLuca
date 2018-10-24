import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ContactoListComponent } from './contacto-list.component';

describe('ContactoListComponent', () => {
  let component: ContactoListComponent;
  let fixture: ComponentFixture<ContactoListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ContactoListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ContactoListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
