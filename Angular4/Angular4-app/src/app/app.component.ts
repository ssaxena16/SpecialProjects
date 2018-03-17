import { Component } from '@angular/core';

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
}
