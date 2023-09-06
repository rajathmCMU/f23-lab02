var rectangle = {
    height:10,
    width:20
}

var getterSet = {
    getHeight: () : number => {
        return 10
    }
    ,
    setHeight:(heights:number) => {
        rectangle.height = heights
    }
}



var areaR:Shape = { 
    area: (height, width):number =>{return rectangle.height*rectangle.width} 
 } 

    

export { areaR, getterSet }