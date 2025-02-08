

function test() {
    for(var i = 0; i < 3; i++) {
        (function(j) {
            setTimeout(function exec() {
                console.log(`i : ${j} ${i}`); // 'i: ' + i
            }, i*1000);
        })(i);
    }
}

test();
