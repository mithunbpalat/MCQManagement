import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { CqkasComponent } from './cqkas/cqkas.component';
import { CqlastgradeComponent } from './cqlastgrade/cqlastgrade.component';
import { CqudcComponent } from './cqudc/cqudc.component';
import { UploadquestionsComponent } from './uploadquestions/uploadquestions.component';

const routes: Routes = [
  {path:"",redirectTo:"adminlogin",pathMatch:"full"},
  {path:"adminlogin",component:AdminloginComponent},
  {path:"udc",component:CqudcComponent},
  {path:"lastgrade",component:CqlastgradeComponent},
  {path:"kas",component:CqkasComponent},
  {path:"uploadquestions",component:UploadquestionsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
