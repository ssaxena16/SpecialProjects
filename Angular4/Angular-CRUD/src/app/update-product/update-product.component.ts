import { Component, OnInit } from '@angular/core';
import { Http, Response, Headers } from '@angular/http';
import { ActivatedRoute } from '@angular/router';
import { Router } from '@angular/router';
import 'rxjs/add/operator/toPromise';

@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.css']
})
export class UpdateProductComponent implements OnInit {
id:number ;
data:Object = {};
productObj:object = {};
products = [];
headers = new Headers({'ContentType': 'application/json'});
  constructor(private router: Router, private route: ActivatedRoute, private http: Http) { }

 updateProduct(product)
 {
   console.log(";;;;;;;;;;"+product.productName);
   this.productObj = {
     "name": product.productName,
     "color": product.productColor,

   };
   //https://stackoverflow.com/questions/43022673/cant-update-user-with-put-request-in-angular-2
   const url = `${"http://localhost:5555/products"}/${this.id}`;
   console.log (JSON.stringify(this.productObj));
    this.http.put(url, this.productObj, { headers: this.headers})
    .toPromise()
   .then(() => {
     console.log ("updatedbjkkjg");
     this.router.navigate(['/']);
   })

 }
  ngOnInit() {
    this.route.params.subscribe( params => {
      this.id = +params['id'];
    });
    this.http.get("http://localhost:5555/products").subscribe(
      (res: Response)=> {
        this.products = res.json();

      for(var i = 0 ; i< this.products.length; i++)
      {
        if (this.id === parseInt(this.products[i].id))
        {
          this.data = this.products[i];
          console.log(this.data);
          break;
        }
      }
    }
    )
  }

}
