// Define pins for RGB LED and button
const int redPin = 9;
const int greenPin = 10;
const int bluePin = 11;
const int buttonPin = 2;

// Define variables for LED colors and button press
int redVal = 0;
int greenVal = 0;
int blueVal = 0;
int buttonState = 0;
int lastButtonState = 0;
int count = 0;

void setup() {
  // Set RGB LED pins as output
  pinMode(redPin, OUTPUT);
  pinMode(greenPin, OUTPUT);
  pinMode(bluePin, OUTPUT);

  // Set button pin as input
  pinMode(buttonPin, INPUT_PULLUP);
}

void loop() {
  // Read the button state
  buttonState = digitalRead(buttonPin);

  // If the button is pressed, increase the count and wait for it to be released
  if (buttonState == LOW && lastButtonState == HIGH) {
    count++;
    delay(50); // Debouncing delay
  }

  // Update last button state
  lastButtonState = buttonState;

  // Turn on the LED depending on the count
  if (count == 1) {
    redVal = 255;
    greenVal = 0;
    blueVal = 0;
  }
  else if (count == 2) {
    redVal = 0;
    greenVal = 0;
    blueVal = 255;
  }
  else if (count == 3) {
    redVal = 0;
    greenVal = 255;
    blueVal = 0;
  }
  else if (count == 4) {
    redVal = 0;
    greenVal = 0;
    blueVal = 0;
    count = 0;
  }

  // Update the LED colors
  analogWrite(redPin, redVal);
  analogWrite(greenPin, greenVal);
  analogWrite(bluePin, blueVal);
}





