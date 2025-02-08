//arrow fn -> this depends on lexical scoping , in normal fn, this depends on parent call

var obj = {
    name: "Sanket",
    company: "Google",
    display: () => {
        console.log(this.name, "works in", this.company);
    }
}

var obj1 = {
    name: "JD",
    company: "Microsoft",
    display: () => {
        setTimeout(() => {
            console.log(this.name, "works in", this.company);
        }, 3000);
    }
}

var obj2 = {
    name: "Sarthak",
    company: "Phonepe",
    display: function() {
        console.log(this);
        setTimeout(function dis() {
            console.log(this.name, "works in", this.company);
        }, 3000);
    }
}

obj2.display();