// function square(sideLen: number): Shape {
//     return {
//         sideLen,
//         computeArea: function (): number {
//             return sideLen * sideLen
//         }
//     }
// }

// export { square }

var square = {
    side:10
}


var areaS:Shape = { 
    area: ():number =>{return square.side*square.side} 
 } 

    

export { areaS }