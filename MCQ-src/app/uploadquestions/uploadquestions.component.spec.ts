import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UploadquestionsComponent } from './uploadquestions.component';

describe('UploadquestionsComponent', () => {
  let component: UploadquestionsComponent;
  let fixture: ComponentFixture<UploadquestionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UploadquestionsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UploadquestionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
