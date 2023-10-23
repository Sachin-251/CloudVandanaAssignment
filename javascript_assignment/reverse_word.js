function reverseWord(str){
    const arr = str.split(" ");
    return arr.map(function(word){
        let reverse = word.split('').reverse().join('');
        if(['.',','].indexOf(reverse[0]) > -1){
            reverse = reverse.slice(1) + reverse[0];
        }
        return reverse;
    }).join(" ");
}

console.log(reverseWord("This is a sunny day."));