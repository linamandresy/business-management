import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminAuthService {

  constructor() { }
  isLoggedIn(): boolean {
    const token = localStorage.getItem('adminToken');
    return !!token;
  }
}
