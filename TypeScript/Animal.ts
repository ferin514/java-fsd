class Animal {
    name: string;
    age: number;
    sound: string;

    constructor(name: string, age: number, sound: string) {
      this.name = name;
      this.age = age;
      this.sound = sound;
    }
  
    makeSound(): void {
      console.log(`${this.name} makes a ${this.sound} sound.`);
    }
  }
  
  class Mammal extends Animal {
    breed: string;
  
    constructor(name: string, age: number, sound: string, breed: string) {
      super(name, age, sound);
      this.breed = breed;
    }
  
    giveBirth(): void {
      console.log(`${this.name} gives birth to a ${this.breed}.`);
    }
  }
  
  class Bird extends Animal {
    wingspan: number;
  
    constructor(name: string, age: number, sound: string, wingspan: number) {
      super(name, age, sound);
      this.wingspan = wingspan;
    }
  
    fly(): void {
      console.log(`${this.name} flies with a wingspan of ${this.wingspan} meters.`);
    }
  }
  
  class Fish extends Animal {
    color: string;
  
    constructor(name: string, age: number, sound: string, color: string) {
      super(name, age, sound);
      this.color = color;
    }
  
    swim(): void {
      console.log(`${this.name} swims in ${this.color} water.`);
    }
  }
  
  // Example usage:
  const lion = new Mammal("Lion", 5, "roar", "cub");
  lion.makeSound(); 
  lion.giveBirth(); 
  
  const eagle = new Bird("Eagle", 3, "screech", 2.5);
  eagle.makeSound(); 
  eagle.fly(); 
  
  const shark = new Fish("Shark", 10, "chomp", "blue");
  shark.makeSound();
  shark.swim(); 
  