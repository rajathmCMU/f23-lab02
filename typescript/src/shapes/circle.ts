// function circle(radius: number): Shape {
//     return {
//         radius,
//         computeArea: function (): number {
//             return Math.PI * radius * radius
//         }
//     }
// }

// export { circle }

var circle = {
    radius:10
}


var areaC:Shape = { 
    area: ():number =>{return Math.PI * circle.radius * circle.radius} 
 } 

    

export { areaC }