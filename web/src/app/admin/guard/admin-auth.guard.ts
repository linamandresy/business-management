import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';
import { AdminAuthService } from '../service/admin-auth.service';

export const adminAuthGuard: CanActivateFn = (route, state) => {
  const authService = inject(AdminAuthService);
  const router = inject(Router);
  if (!authService.isLoggedIn()) {
    router.navigate(['/admin/login']);
    return false;
  }
  return true;
};
