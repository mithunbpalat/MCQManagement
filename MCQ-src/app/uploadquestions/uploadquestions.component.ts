import { Component, OnInit } from '@angular/core';
import { HttpEventType, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { McqService } from '../mcq.service';

@Component({
  selector: 'app-uploadquestions',
  templateUrl: './uploadquestions.component.html',
  styleUrls: ['./uploadquestions.component.css']
})
export class UploadquestionsComponent implements OnInit {

  selectedFiles?: FileList;
  currentFile?: File;
  progress = 0;
  message = '';
  str :any;

  fileInfos?: Observable<any>;

  constructor(private service: McqService) { }

  ngOnInit(): void {
    this.fileInfos = this.service.getFiles();
  }

  selectFile(event: any): void {
    if(this.str.endsWith(".csv")){
    this.selectedFiles = event.target.files;
    }
  }
  
  upload(): void {
    this.progress = 0;

    if (this.selectedFiles) {
      const file: File | null = this.selectedFiles.item(0);

      if (file) {
        this.currentFile = file;

        this.service.upload(this.currentFile).subscribe({
          next: (event: any) => {
            if (event.type === HttpEventType.UploadProgress) {
              this.progress = Math.round(100 * event.loaded / event.total);
            } else if (event instanceof HttpResponse) {
              this.message = event.body.message;
              this.fileInfos = this.service.getFiles();
            }
          },
          error: (err: any) => {
            console.log(err);
            this.progress = 0;

            if (err.error && err.error.message) {
              this.message = err.error.message;
            } else {
              this.message = 'Could not upload the file!';
            }

            this.currentFile = undefined;
          }
        });
      }

      this.selectedFiles = undefined;
    }
  }
}
