import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Observable';

import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';

@Injectable()
export class UserService {
  private baseUrl:string = 'http://localhost:8080/api';
  private headers = new Headers({'Content-Type':'application.json'});
  private options = new RequestOptions({headers:this.headers});

  constructor(private http:Http) { }

  getUsers()
  {
    return this.http.get(this.baseUrl+'/users',this.options).map((response:Response)=> response.json())
    .catch(this.errorHandler);
  }
  errorHandler(error:Response)
  {
    return Observable.throw(error || "SERVER ERROR");
  }

}
