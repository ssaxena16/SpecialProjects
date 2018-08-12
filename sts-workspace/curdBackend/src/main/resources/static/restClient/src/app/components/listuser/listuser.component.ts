import { Component, OnInit } from '@angular/core';
import { UserService } from '../../shared-service/user.service';
import { User } from '../../user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-listuser',
  templateUrl: './listuser.component.html',
  styleUrls: ['./listuser.component.css']
})
export class ListuserComponent implements OnInit {

  private users:User[] ;
  constructor(private userService:UserService, private router:Router ) { }

  ngOnInit() {
    this.userService.getUsers().subscribe((users) => {
      this.users = users;
      console.log(users);
    },(error)=>
    {
      console.log(error);
    })
  }
  deleteUser(user)
  {
    console.log("Testing....."+user.id)
    this.userService.deleteUser(user.id).subscribe((data)=>
  {
    this.users.splice(this.users.indexOf(user),1);

  },(error) =>
{
  console.log(error);
})
  }
  updateUser(user)
  {
    console.log("Update........");
    this.userService.setter(user);
    this.router.navigate(['/op']);

  }
  createUser()
  {
    let user = new User();
    this.userService.setter(user);
    this.router.navigate(['/op']);

  }

}
