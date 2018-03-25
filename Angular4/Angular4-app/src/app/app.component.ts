import { Component } from '@angular/core';
import { Http } from '@angular/http';
import { FormGroup, FormControl } from '@angular/forms';
import 'rxjs/add/operator/map';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Hello Angular Program';
  months = ["January", "Feburary", "March", "April", "May",
            "June", "July", "August", "September",
            "October", "November", "December"];
  isAvailable = true ;
  httpdata;
  emailAddress;
  emailid;
  formdata;
  functionClickMe(event)
  {
    alert("Event is triggered");
    this.isAvailable = false;
    this.months[6] = "Sachin Birthday"
  }
  functionChageMonth(event)
  {
    alert("Test Months");
  }
  constructor(private http: Http)
  {

  }
  ngOnInit()
  {
    this.http.get("http://jsonplaceholder.typicode.com/users").
    map((response) => response.json()).
    subscribe((data) => {this.displaydata(data)})
    this.formdata = new FormGroup({
      emailid: new FormControl(""),
      password: new FormControl("")
    });
  }
  displaydata(data)
  {
    this.httpdata = data ;
  }
  onclickSubmit(data)
  {
    alert("EmailId is=="+data.emailid);
    this.emailid = data.emailid
  }
}
