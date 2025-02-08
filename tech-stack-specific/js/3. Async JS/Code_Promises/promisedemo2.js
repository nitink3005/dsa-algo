function demo2(val) {
    return new Promise(function (resolve, reject) {
        console.log("Start");
        setTimeout(function process() {
            console.log("Completed timer");
            if(val%2 == 0) {
                // even number
                resolve("Even");
            } else {
                // odd number
                reject("Odd");
            }
        }, 10000);
        console.log("Somewhere");
    });
}

console.log('starting demo2 call');

demo2(3).then((res)=>{
    console.log(`promise completed with`, res);
}).catch((err)=>{
    console.log('promise rejected !!', err);
})

console.log('demo2 call finished');
