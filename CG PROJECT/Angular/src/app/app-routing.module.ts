import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { AddflightComponent } from './addflight/addflight.component';
import { GetallflightsComponent } from './getallflights/getallflights.component';
import { UpdateflightComponent } from './updateflight/updateflight.component';


const routes: Routes = [
  { path: 'aboutus', component: AboutusComponent},
  { path: 'addflight', component: AddflightComponent},
  { path: 'getallflights', component: GetallflightsComponent},
  { path: 'modify-flight/:flightNumber', component:UpdateflightComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
