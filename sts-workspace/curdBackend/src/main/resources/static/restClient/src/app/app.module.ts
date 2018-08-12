import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {FormsModule } from '@angular/forms'

import { UserService } from './shared-service/user.service';
import { AppComponent } from './app.component';
import { ListuserComponent } from './components/listuser/listuser.component';
import { UserFormComponent } from './components/user-form/user-form.component';
import { HttpModule } from '@angular/http';


const appRoutes:Routes = [
  { path:'' , component: ListuserComponent} ,
  { path: 'op', component: UserFormComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    ListuserComponent,
    UserFormComponent,
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes),
    HttpModule,
    FormsModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
