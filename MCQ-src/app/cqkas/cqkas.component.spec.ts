import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CqkasComponent } from './cqkas.component';

describe('CqkasComponent', () => {
  let component: CqkasComponent;
  let fixture: ComponentFixture<CqkasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CqkasComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CqkasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
