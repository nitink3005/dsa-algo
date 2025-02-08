//isNan does coercion , whereas as Number.isNan doesn't do coercion

let a = "10";
let b = "abc"; 
let c = "sanket";
let d = 10 - c;
console.log(a, b, c, d);

console.log(isNaN(a));
console.log(isNaN(b));
console.log(isNaN(c));
console.log(isNaN(d));


let x = ""
console.log(x);
console.log((typeof(x) == 'number' && isNaN(x)) ? "NaN value" : "Not NaN value");


//Correct way of checking for isNan
console.log(Number.isNaN(NaN));
console.log(Number.isNaN("abc"));
// This function doesn't do coercion
