  } else {
  callback(new Error(`Could not fetch weather for ${city}`), null);
  }
  }, 50);
  }

  function getWeatherCallback(city) {
  fetchWeatherWithCallback(city, (error, result) => {
  if (error) {
  console.log("Callback Error:", error);
  } else {
  console.log("Callback:", result);
  }
  });
  }

  getWeatherAsync("Delhi");
  getWeatherPromise("Mumbai");
  getWeatherCallback("Bangalore");
