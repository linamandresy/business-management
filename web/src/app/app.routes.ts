import { Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { AdminComponent } from './admin/admin.component';
import { AdminLoginComponent } from './admin/admin-login/admin-login.component';
import { DashboardComponent } from './admin/dashboard/dashboard.component';
import { adminAuthGuard } from './admin/guard/admin-auth.guard';

export const routes: Routes = [{
    path: '',
    component: AppComponent
},{
    path:'admin/login',
    component:AdminLoginComponent
},{
    path:'admin',
    component:AdminComponent,
    children:[{
        path:'dashboard',
        component:DashboardComponent,
        canActivate:[adminAuthGuard]
    },{
        path: '**',
        redirectTo: '/admin/dashboard'
    }]
},{
    path: '**',
    redirectTo: '/'
}];
