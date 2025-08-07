import { Component } from '@angular/core';
import { environment } from '../../../environments/environments';

@Component({
  selector: 'app-admin-login',
  imports: [],
  templateUrl: './admin-login.component.html',
  styleUrl: './admin-login.component.scss'
})
export class AdminLoginComponent {
  appName:string = environment.appName;
}
