import { Component, OnInit } from '@angular/core';
import { Http, Response, Headers } from '@angular/http';


@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  constructor(private http: Http) { }
  projectObj:object = {};
  confirmationString: string = "New Product has been added.";
  isAdded: boolean = false;

  addNewProduct = function(product)
  {
    this.projectObj = {
      "name": product.productName,
      "color": product.productColor
    }
    console.log(this.projectObj);
    this.http.post("http://localhost:5555/products/", this.projectObj).subscribe((res:Response) =>
    {
      this.isAdded = true
    })

  }

  ngOnInit() {
  }

}
