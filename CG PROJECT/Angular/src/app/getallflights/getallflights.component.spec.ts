import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetallflightsComponent } from './getallflights.component';

describe('GetallflightsComponent', () => {
  let component: GetallflightsComponent;
  let fixture: ComponentFixture<GetallflightsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetallflightsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetallflightsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
