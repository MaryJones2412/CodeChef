const cartPrices = [29.99, 9.99, 4.99, 14.99, 25.00];

// complete the code 
// Using reduce to calculate the total price
const totalPrice = cartPrices.reduce((total,price)=>{
    return total+price;
},0) ;
console.log(totalPrice);