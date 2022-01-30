import { Component, OnInit } from '@angular/core';
import { Question } from '../gquestion';
import { Search } from '../gsearch';
import { Udcdetails } from '../gudcdetails';
import { McqService } from '../mcq.service';

@Component({
  selector: 'app-cqudc',
  templateUrl: './cqudc.component.html',
  styleUrls: ['./cqudc.component.css']
})
export class CqudcComponent implements OnInit {

  udcdetail: any= new Udcdetails(0,"","","");
  udcdetails:any;
  udcquestion: any= new Question(0,"","","","","","","","",);
  udcquestions: any;
  search1 :any=new Search(0);
  search2 :any=new Search(0);
  
  constructor(private service: McqService) { }

  ngOnInit(): void {
    let resp=this.service.getUdcdetailss();
    resp.subscribe((data)=>this.udcdetails=data);

    let respo=this.service.getUdcquestions();
    respo.subscribe((data)=>this.udcquestions=data);
  }



  public udcNow(){
    let resp = this.service.postUdcdetails(this.udcdetail);
    resp.subscribe((data)=>this.udcdetails=data);
  }
  public updateUdcNow(){
    let resp = this.service.updateUdcdetails(this.udcdetail);
    resp.subscribe((data)=>this.udcdetails=data);
  }
  public delUdc(uid:number){
    let resp=this.service.deleteUdcdetails(uid);
    resp.subscribe((data)=>this.udcdetails=data);
  }
  public searchByUId(a:number){
    let resp=this.service.getUdcdetailsById(a);
    resp.subscribe((data)=>this.udcdetail=data);
  }



  public udcquestionNow(){
    let resp = this.service.postUdcquestion(this.udcquestion);
    resp.subscribe((data)=>this.udcquestions=data);
  }
  public updateUdcquestionNow(){
    let resp = this.service.updateUdcquestion(this.udcquestion);
    resp.subscribe((data)=>this.udcquestions=data);
  }
  public delUdcquestion(qid:number){
    let resp=this.service.deletequestion(qid);
    resp.subscribe((data)=>this.udcquestions=data);
  }
  public searchById(a:number){
    let resp=this.service.getUdcquestionById(a);
    resp.subscribe((data)=>this.udcquestion=data);
  }
}
