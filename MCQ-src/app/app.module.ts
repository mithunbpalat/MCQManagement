import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { CqudcComponent } from './cqudc/cqudc.component';
import { CqlastgradeComponent } from './cqlastgrade/cqlastgrade.component';
import { CqkasComponent } from './cqkas/cqkas.component';
import { UploadquestionsComponent } from './uploadquestions/uploadquestions.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { McqService } from './mcq.service';

@NgModule({
  declarations: [
    AppComponent,
    AdminloginComponent,
    CqudcComponent,
    CqlastgradeComponent,
    CqkasComponent,
    UploadquestionsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [McqService],
  bootstrap: [AppComponent]
})
export class AppModule { }
