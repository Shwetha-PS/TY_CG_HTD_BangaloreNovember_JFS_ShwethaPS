import { TestBed } from '@angular/core/testing';

import { AddflightService } from './addflight.service';

describe('AddflightService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AddflightService = TestBed.get(AddflightService);
    expect(service).toBeTruthy();
  });
});
