import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';
import 'rxjs/add/operator/toPromise';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private http: Http ) { }
  jsonData = [];
  headers = new Headers({'ContentType': 'application/json'});
  id: number;
 getProductsData = function()
  {
    this.http.get("http://localhost:5555/products").subscribe(
      (res: Response)=> {
        this.jsonData = res.json();
      }
    )

}
deleteProduct = function(id)
 {
   if(confirm("Are you sure want to delete the item"))
   {
   return this.http.delete("http://localhost:5555/products/"+id,{ headers: this.headers}).toPromise().then(() =>{

       console.log("Testing ");
     this.getProductsData();
   })
 }

}

  ngOnInit() {
    this.getProductsData();
  }

}
