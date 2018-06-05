import { Component } from '@angular/core';
import { AppService } from './app.service';

import { HomeComponent } from './home/home.component';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
	
constructor(private http: HttpClient){};
  //title = 'Angular 6 app';
 // console.log('ngular 6 app');
  //console.log(originList);
  //console.log(this.appService.getLocationList());
}
