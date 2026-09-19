const words = ["apple", "banana", "cherry", "watermelon", "kiwi"];

// complete the code 
const longestWord=words.reduce((longest,word)=>{
    return word.length> longest.length?word:longest;
},"");
console.log(longestWord);



