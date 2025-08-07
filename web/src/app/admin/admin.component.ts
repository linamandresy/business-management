import { Component } from '@angular/core';
import { environment } from '../../environments/environments';
import { RouterOutlet } from '@angular/router';
// import { RouterOutlet } from "../../../node_modules/@angular/router/router_module.d-Bx9ArA6K";

@Component({
  selector: 'app-admin',
  imports: [RouterOutlet],
  templateUrl: './admin.component.html',
  styleUrl: './admin.component.scss'
})
export class AdminComponent {
  appName:string = environment.appName;

  collapseSidebar: boolean = false;

  toggleSidebar():void {
    this.collapseSidebar = !this.collapseSidebar;
    const sidebar = document.getElementById('sidebar');
    if (sidebar) {
      sidebar.classList.toggle('collapsed', this.collapseSidebar);
    }
  }
}
