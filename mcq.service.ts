import { HttpClient, HttpHeaders, HttpRequest, HttpEvent } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';
import { Kasdetails } from './gkasdetails';
import { Lgdetails } from './glgdetails';
import { Question } from './gquestion';
import { Udcdetails } from './gudcdetails';

@Injectable({
  providedIn: 'root'
})
export class McqService {

  private baseUrl = 'http://localhost:8083';
  constructor(private http:HttpClient) { }

  upload(file: File): Observable<HttpEvent<any>> {
    const formData: FormData = new FormData();

    formData.append('file', file);

    const req = new HttpRequest('POST', `${this.baseUrl}/upload`, formData, {
      reportProgress: true,
      responseType: 'json'
    });

    return this.http.request(req);
  }

  getFiles(): Observable<any> {
    return this.http.get(`${this.baseUrl}/files`);
  }



  public getAdminByUsername(a:any){
    return this.http.get("http://localhost:8083/getadminbyusername?username="+a);
  }


  public postUdcdetails(udcdetails: Udcdetails){
    return this.http.post("http://localhost:8083/postudcdetails",udcdetails,{responseType:'text' as 'json'});
  }
  public updateUdcdetails(udcdetails: Udcdetails){
    return this.http.put("http://localhost:8083/updateudcdetails",udcdetails,{responseType:'text' as 'json'});
  }
  public getUdcdetailss(){
    return this.http.get("http://localhost:8083/getalludcdetails");
  }
  public getUdcdetailsById(a:number){
    return this.http.get("http://localhost:8083/getudcdetailsbyid?uid="+a);
  }
  public deleteUdcdetails(a:number){
    return this.http.delete("http://localhost:8083/deleteudcdetailsbyid?uid="+a);
  }  


  public postLgdetails(lgdetails: Lgdetails){
    return this.http.post("http://localhost:8083/postlgdetails",lgdetails,{responseType:'text' as 'json'});
  }
  public updateLgdetails(lgdetails: Lgdetails){
    return this.http.put("http://localhost:8083/updatelgdetails",lgdetails,{responseType:'text' as 'json'});
  }
  public getLgdetailss(){
    return this.http.get("http://localhost:8083/getalllgdetails");
  }
  public getLgdetailsById(a:number){
    return this.http.get("http://localhost:8083/getlgdetailsbyid?lid="+a);
  }
  public deleteLgdetails(a:number){
    return this.http.delete("http://localhost:8083/deletelgdetailsbyid?lid="+a);
  }


  public postKasdetails(kasdetails: Kasdetails){
    return this.http.post("http://localhost:8083/postkasdetails",kasdetails,{responseType:'text' as 'json'});
  }
  public updateKasdetails(kasdetails: Kasdetails){
    return this.http.put("http://localhost:8083/updatekasdetails",kasdetails,{responseType:'text' as 'json'});
  }
  public getKasdetailss(){
    return this.http.get("http://localhost:8083/getallkasdetails");
  }
  public getKasdetailsById(a:number){
    return this.http.get("http://localhost:8083/getkasdetailsbyid?kid="+a);
  }
  public deleteKasdetails(a:number){
    return this.http.delete("http://localhost:8083/deletekasdetailsbyid?kid="+a);
  }


  public postKasquestion(question: Question){
    return this.http.post("http://localhost:8083/postkasquestion",question,{responseType:'text' as 'json'});
  }
  public updateKasquestion(question: Question){
    return this.http.put("http://localhost:8083/updatekasquestion",question,{responseType:'text' as 'json'});
  }
  public getKasquestions(){
    return this.http.get("http://localhost:8083/getallkasquestions");
  }
  public getKasquestionById(a:number){
    return this.http.get("http://localhost:8083/getkasquestionbyid?qid="+a);
  }
  public deleteKasquestion(a:number){
    return this.http.delete("http://localhost:8083/deletekasquestionbyid?qid="+a);
  }



  public postLgquestion(question: Question){
    return this.http.post("http://localhost:8083/postlgquestion",question,{responseType:'text' as 'json'});
  }
  public updateLgquestion(question: Question){
    return this.http.put("http://localhost:8083/updatelgquestion",question,{responseType:'text' as 'json'});
  }
  public getLgquestions(){
    return this.http.get("http://localhost:8083/getalllgquestions");
  }
  public getLgquestionById(a:number){
    return this.http.get("http://localhost:8083/getlgquestionbyid?qid="+a);
  }
  public deleteLgquestion(a:number){
    return this.http.delete("http://localhost:8083/deletelgquestionbyid?qid="+a);
  }



  public postUdcquestion(question: Question){
    return this.http.post("http://localhost:8083/postudcquestion",question,{responseType:'text' as 'json'});
  }
  public updateUdcquestion(question: Question){
    return this.http.put("http://localhost:8083/updateudcquestion",question,{responseType:'text' as 'json'});
  }
  public getUdcquestions(){
    return this.http.get("http://localhost:8083/getalludcquestions");
  }
  public getUdcquestionById(a:number){
    return this.http.get("http://localhost:8083/getudcquestionbyid?qid="+a);
  }
  public deletequestion(a:number){
    return this.http.delete("http://localhost:8083/deleteudcquestionbyid?qid="+a);
  }
}
