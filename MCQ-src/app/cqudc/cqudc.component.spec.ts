import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CqudcComponent } from './cqudc.component';

describe('CqudcComponent', () => {
  let component: CqudcComponent;
  let fixture: ComponentFixture<CqudcComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CqudcComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CqudcComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
