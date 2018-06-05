import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

//import {InterceptorModule} from './interceptor/interceptor.module';

import { AppComponent } from './app.component';
import { RoutesComponent } from './routes/routes.component';
import { HomeComponent } from './home/home.component';
import { Observable } from 'rxjs';

import { RouteService } from './routes/route.service';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'routes', component: RoutesComponent }
];

@NgModule({
  declarations: [
    AppComponent,
    RoutesComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(routes),
    HttpClientModule
  ],
  exports: [
    RouterModule
  ],
  providers: [RouteService],
  bootstrap: [AppComponent]
})
export class AppModule { }
