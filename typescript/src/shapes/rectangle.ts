import { Shape } from "./shape"

var rectangle = {
    height:10,
    width:20
}

var getterSet = {
    
    getHeight: () : number => {
        return rectangle.height;
    }
    ,
    setHeight:(newHeight:number) => {
        rectangle.height = newHeight
    }
}



var areaR:Shape = { 
    area: ():number =>{return rectangle.height*rectangle.width} 
} 

    

export { areaR, getterSet }