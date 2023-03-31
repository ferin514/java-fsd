var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Animal = /** @class */ (function () {
    function Animal(name, age, sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }
    Animal.prototype.makeSound = function () {
        console.log("".concat(this.name, " makes a ").concat(this.sound, " sound."));
    };
    return Animal;
}());
var Mammal = /** @class */ (function (_super) {
    __extends(Mammal, _super);
    function Mammal(name, age, sound, breed) {
        var _this = _super.call(this, name, age, sound) || this;
        _this.breed = breed;
        return _this;
    }
    Mammal.prototype.giveBirth = function () {
        console.log("".concat(this.name, " gives birth to a ").concat(this.breed, "."));
    };
    return Mammal;
}(Animal));
var Bird = /** @class */ (function (_super) {
    __extends(Bird, _super);
    function Bird(name, age, sound, wingspan) {
        var _this = _super.call(this, name, age, sound) || this;
        _this.wingspan = wingspan;
        return _this;
    }
    Bird.prototype.fly = function () {
        console.log("".concat(this.name, " flies with a wingspan of ").concat(this.wingspan, " meters."));
    };
    return Bird;
}(Animal));
var Fish = /** @class */ (function (_super) {
    __extends(Fish, _super);
    function Fish(name, age, sound, color) {
        var _this = _super.call(this, name, age, sound) || this;
        _this.color = color;
        return _this;
    }
    Fish.prototype.swim = function () {
        console.log("".concat(this.name, " swims in ").concat(this.color, " water."));
    };
    return Fish;
}(Animal));
// Example usage:
var lion = new Mammal("Lion", 5, "roar", "cub");
lion.makeSound(); // Lion makes a roar sound.
lion.giveBirth(); // Lion gives birth to a cub.
var eagle = new Bird("Eagle", 3, "screech", 2.5);
eagle.makeSound(); // Eagle makes a screech sound.
eagle.fly(); // Eagle flies with a wingspan of 2.5 meters.
var shark = new Fish("Shark", 10, "chomp", "blue");
shark.makeSound(); // Shark makes a chomp sound.
shark.swim(); // Shark swims in blue water.
