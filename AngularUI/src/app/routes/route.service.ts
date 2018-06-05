import { Injectable } from '@angular/core';
import { HttpClient  } from '@angular/common/http';

//@Injectable()
@Injectable({
  providedIn: 'root'
})
export class RouteService {
  public locationArr: {origin: '', destination: ''};
 
  constructor(private http: HttpClient ) { }

  public setSearchParams(loc){
    this.locationArr = loc;
  }

  public getSearchParams(){
  console.log("check serach params");
  console.log(this.locationArr);
    return this.locationArr;
  }

  public setRouteDetails(routeArr){
      console.log("inside set router details");
  }

//Fetch route detials from API using http call

  getRouteDetails11(orig, dest){
  
  
   return this.http.get('https://my-json-server.typicode.com/suchismita1234/UIDemo1/db').
    subscribe(data => {
    //  console.log(data.list);
   })
  }
  getRouteDetails(orig, dest){
  	//httppost
  	return [
   {
      "routekey":101,
      "containerType":"20FT",
      "duration":50,
      "price":1120,
      "journeyLegs":[
         {
            "sequence":1,
            "origin":"INDEL",
            "destination":"INBOM",
            "mode":"inland",
            "startDate":"01-JUN-2018",
            "endDate":"02-JUN-2018",
            "cutoffDate":"",
            "duration":5,
            "price":180,
            "vessel":"",
            "voyage":""
         },
         {
            "sequence":2,
            "origin":"INBOM",
            "destination":"NLRTM",
            "mode":"ocean",
            "startDate":"11-JUN-2018",
            "endDate":"30-JUN-2018",
            "cutoffDate":"09-JUN-2018",
            "duration":20,
            "price":680,
            "vessel":"CMA CGM LA TRAVIATA",
            "voyage":"LT101"
         },
         {
            "sequence":3,
            "origin":"NLRTM",
            "destination":"FRMRS",
            "mode":"inland",
            "startDate":"01-JUL-2018",
            "endDate":"15-JUL-2018",
            "cutoffDate":"",
            "duration":6,
            "price":260,
            "vessel":"",
            "voyage":""
         }
      ]
   },
   {
      "routekey":102,
      "containerType":"20FT",
      "duration":50,
      "price":1120,
      "journeyLegs":[
         {
            "sequence":1,
            "origin":"INDEL",
            "destination":"INMAA",
            "mode":"inland",
            "startDate":"01-JUN-2018",
            "endDate":"05-JUN-2018",
            "cutoffDate":"",
            "duration":5,
            "price":180,
            "vessel":"",
            "voyage":""
         },
         {
            "sequence":2,
            "origin":"INMAA",
            "destination":"BEANR",
            "mode":"ocean",
            "startDate":"11-JUN-2018",
            "endDate":"30-JUN-2018",
            "cutoffDate":"09-JUN-2018",
            "duration":20,
            "price":680,
            "vessel":"CMA CGM LA TRAVIATA",
            "voyage":"LT101"
         },
         {
            "sequence":3,
            "origin":"BEANR",
            "destination":"FRMRS",
            "mode":"inland",
            "startDate":"01-JUL-2018",
            "endDate":"06-JUL-2018",
            "cutoffDate":"",
            "duration":6,
            "price":260,
            "vessel":"",
            "voyage":""
         }
      ]
   }
]
  }
}
