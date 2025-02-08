/* difference between abstract equality vs strict equality 

 ==  does type comparison , and if type same calls ===, which also check types and return true or false,
 if == type are not same it does typer conversion which === doesn't do.


*/

console.log(NaN === 23);
console.log(NaN === NaN);
console.log(33 === 33);
console.log(33 === 23);
console.log(0 === -0);
console.log(-0 === 0);
console.log(undefined === undefined);
console.log(null === null);
console.log("sanket" === "sanket");
console.log({} === {});
let x = {};
console.log(x === x);
console.log(Symbol('sanket') === Symbol('sanket'));
let y = Symbol('sanket');
console.log(y === y);
