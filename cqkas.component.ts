import { Component, OnInit } from '@angular/core';
import { Kasdetails } from '../gkasdetails';
import { Question } from '../gquestion';
import { Search } from '../gsearch';
import { McqService } from '../mcq.service';

@Component({
  selector: 'app-cqkas',
  templateUrl: './cqkas.component.html',
  styleUrls: ['./cqkas.component.css']
})
export class CqkasComponent implements OnInit {
  kasdetail: any= new Kasdetails(0,"","","");
  kasdetails:any;
  kasquestion: any= new Question(0,"","","","","","","","",);
  kasquestions: any;
  search1 :any=new Search(0);
  search2 :any=new Search(0);
  
  constructor(private service: McqService) { }

  ngOnInit(): void {
    let resp=this.service.getKasdetailss();
    resp.subscribe((data)=>this.kasdetails=data);

    let respo=this.service.getKasquestions();
    respo.subscribe((data)=>this.kasquestions=data);
  }



  public KasNow(){
    let resp = this.service.postKasdetails(this.kasdetail);
    resp.subscribe((data)=>this.kasdetails=data);
  }
  public updateKasNow(){
    let resp = this.service.updateKasdetails(this.kasdetail);
    resp.subscribe((data)=>this.kasdetails=data);
  }
  public delKas(kid:number){
    let resp=this.service.deleteKasdetails(kid);
    resp.subscribe((data)=>this.kasdetails=data);
  }
  public searchByKId(a:number){
    let resp=this.service.getKasdetailsById(a);
    resp.subscribe((data)=>this.kasdetail=data);
  }



  public KasquestionNow(){
    let resp = this.service.postKasquestion(this.kasquestion);
    resp.subscribe((data)=>this.kasquestions=data);
  }
  public updateKasquestionNow(){
    let resp = this.service.updateKasquestion(this.kasquestion);
    resp.subscribe((data)=>this.kasquestions=data);
  }
  public delKasquestion(qid:number){
    let resp=this.service.deleteKasquestion(qid);
    resp.subscribe((data)=>this.kasquestions=data);
  }
  public searchById(a:number){
    let resp=this.service.getKasquestionById(a);
    resp.subscribe((data)=>this.kasquestion=data);
  }

}
