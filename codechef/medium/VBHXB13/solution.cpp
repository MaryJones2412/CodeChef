
console.log("Order confirmed!");
// Synchronous message continues immediately
// Asynchronous operation with 2-second delay
setTimeout(()=>{console.log("Confirming order...")},2000);
// Synchronous message
console.log("Order placed!");