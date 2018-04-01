import { Component, OnInit } from '@angular/core';
import { UserService } from '../../shared-service/user.service';
import { User } from '../../user';

@Component({
  selector: 'app-listuser',
  templateUrl: './listuser.component.html',
  styleUrls: ['./listuser.component.css']
})
export class ListuserComponent implements OnInit {

  private users:User[] ;
  constructor(private userService:UserService) { }

  ngOnInit() {
    this.userService.getUsers().subscribe((users) => {
      this.users = users;
      console.log(users);
    },(error)=>
    {
      console.log(error);
    })
  }

}
