import { Component, OnInit } from '@angular/core';
import { Lgdetails } from '../glgdetails';
import { Question } from '../gquestion';
import { Search } from '../gsearch';
import { McqService } from '../mcq.service';

@Component({
  selector: 'app-cqlastgrade',
  templateUrl: './cqlastgrade.component.html',
  styleUrls: ['./cqlastgrade.component.css']
})
export class CqlastgradeComponent implements OnInit {

  lgdetail: any= new Lgdetails(0,"","","");
  lgdetails:any;
  lgquestion: any= new Question(0,"","","","","","","","",);
  lgquestions: any;
  search1 :any=new Search(0);
  search2 :any=new Search(0);
  
  constructor(private service: McqService) { }

  ngOnInit(): void {
    let resp=this.service.getLgdetailss();
    resp.subscribe((data)=>this.lgdetails=data);

    let respo=this.service.getLgquestions();
    respo.subscribe((data)=>this.lgquestions=data);
  }



  public lgNow(){
    let resp = this.service.postLgdetails(this.lgdetail);
    resp.subscribe((data)=>this.lgdetails=data);
  }
  public updateLgNow(){
    let resp = this.service.updateLgdetails(this.lgdetail);
    resp.subscribe((data)=>this.lgdetails=data);
  }
  public delLg(lid:number){
    let resp=this.service.deleteLgdetails(lid);
    resp.subscribe((data)=>this.lgdetails=data);
  }
  public searchByLId(a:number){
    let resp=this.service.getLgdetailsById(a);
    resp.subscribe((data)=>this.lgdetail=data);
  }



  public lgquestionNow(){
    let resp = this.service.postLgquestion(this.lgquestion);
    resp.subscribe((data)=>this.lgquestions=data);
  }
  public updateLgquestionNow(){
    let resp = this.service.updateLgquestion(this.lgquestion);
    resp.subscribe((data)=>this.lgquestions=data);
  }
  public delLgquestion(qid:number){
    let resp=this.service.deleteLgquestion(qid);
    resp.subscribe((data)=>this.lgquestions=data);
  }
  public searchById(a:number){
    let resp=this.service.getLgquestionById(a);
    resp.subscribe((data)=>this.lgquestion=data);
  }
}
