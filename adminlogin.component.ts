import { Component, OnInit } from '@angular/core';
import { Admin } from '../gadmin';
import { McqService } from '../mcq.service';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  admin : any=new Admin(1,"","");
  test : any=new Admin(1,"","");
  response:any;
  constructor(private service: McqService) { }

  ngOnInit(): void {
   
  }
  public verify(au: string, tu: string,ap: string, tp: string){
    if(tu!="" && tp!=""){
      if(au == tu && ap == tp){
      (<HTMLInputElement>document.getElementById("demo")).disabled=false;
      (<HTMLInputElement>document.getElementById("demo")).innerText="LOGIN";
      (<HTMLInputElement>document.getElementById("demo1")).innerText= "Hello Admin/User Log into your account";
    }
  }
}
  public searchById(a:string){
    let resp=this.service.getAdminByUsername(a);
    resp.subscribe((data)=>this.admin=data);
}
}
