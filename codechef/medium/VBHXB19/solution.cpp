function prepareBread() {
  return new Promise(resolve => {
  setTimeout(() => {
  resolve("Bread prepared!");
  }, 1000);
  });
  }
  function addFilling() {
  return new Promise(resolve => {
  setTimeout(() => {
  resolve("Filling added!");
  }, 2000);
  });
  }
  function wrapSandwich() {
  return new Promise(resolve => {
  setTimeout(() => {
  resolve("Sandwich wrapped!");
  }, 500);
  });
  }
  async function prepareSandwich() {
  const bread = await prepareBread();
  console.log(bread);
  const filling = await addFilling();
  console.log(filling);
  const wrapped = await wrapSandwich();
  console.log(wrapped);
  return "Sandwich is ready to eat!";
  }
  prepareSandwich().then(result => console.log(result));
