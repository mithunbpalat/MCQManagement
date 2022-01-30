import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CqlastgradeComponent } from './cqlastgrade.component';

describe('CqlastgradeComponent', () => {
  let component: CqlastgradeComponent;
  let fixture: ComponentFixture<CqlastgradeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CqlastgradeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CqlastgradeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
