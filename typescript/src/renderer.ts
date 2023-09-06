import { areaR, getterSet } from "./shapes/rectangle.js";
import { areaS } from "./shapes/square.js";
import { areaC } from "./shapes/circle.js";


function draw(x: number) {

    console.log("current height: " ,getterSet.getHeight);
    console.log("Shape rect drawn\n" + "Its area is " + areaR.area())
    getterSet.setHeight(500);
    console.log("new height: " ,getterSet.getHeight);
    switch (x) {
        case 1:
            console.log("Shape rect (new) drawn\n" + "Its area is " + areaR.area())
            break;
        case 2:
            console.log("Shape square drawn\n" + "Its area is " + areaS.area())
            break;
        case 3:
            console.log("Shape Circle drawn\n" + "Its area is " + areaC.area())
            break;
        default:
            break;
    }
}

export { draw }