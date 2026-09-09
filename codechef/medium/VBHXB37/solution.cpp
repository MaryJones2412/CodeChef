
  setImmediate(() => {
    console.log("Immediate");
  });

  setTimeout(() => {
    console.log("Timeout");
  }, 0);

  console.log("End");
}

module.exports = { runOrderExample };

if (require.main === module) {
  runOrderExample();
}
  });
    console.log("Promise");
  Promise.resolve().then(() => {

  });
    console.log("Next Tick");
  process.nextTick(() => {

  console.log("Start");
function runOrderExample() {