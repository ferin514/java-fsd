function findMax(numbers) {
    var max = numbers[0];
    for (var i = 1; i < numbers.length; i++) {
        if (numbers[i] > max) {
            max = numbers[i];
        }
    }
    return max;
}
var numbers = [5, 2, 9, 1, 7];
var max = findMax(numbers);
console.log(max); 
