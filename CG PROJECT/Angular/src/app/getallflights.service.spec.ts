import { TestBed } from '@angular/core/testing';

import { GetallflightsService } from './getallflights.service';

describe('GetallflightsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: GetallflightsService = TestBed.get(GetallflightsService);
    expect(service).toBeTruthy();
  });
});
