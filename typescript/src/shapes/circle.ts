import { Shape } from "./shape"

var circle = {
    radius:10
}


var areaC:Shape = { 
    area: ():number =>{return Math.PI * circle.radius * circle.radius} 
 } 

export { areaC }