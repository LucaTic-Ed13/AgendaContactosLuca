export *  from './contacto/contacto.service';
//Para la version v2 ademas exporto este
export * from './contacto-edit/contacto-edit.service';


//Esto permite no tener que incluirlos en app.module.ts
//SIno tendría que hacer algo parecido a

//import { GiphyService } from './shared/giphy/giphy.service';
//import { CarService } from './shared/car/car.service';

//@NgModule({
//  ...
// providers: [CarService, GiphyService],
//  bootstrap: [AppComponent]
//})