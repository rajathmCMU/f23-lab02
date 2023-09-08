import { Shape } from "./shape"

var square = {
    side:10
}


var areaS:Shape = { 
    area: ():number =>{return square.side*square.side} 
 } 

export { areaS }