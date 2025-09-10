

import 'dart:math';


void task2_part1() {
  print("Gulirano Tojimurodova");
}

void task3_part1() {
  print("Welcome to Dart Programming.");
  print("Let's start coding!");
}

void task4_part1() {   
  print("1 Amir Temur Avenue\nTashkent, Uzbekistan\n100000");
}

void task5_part1() {
  print("The current year is 2025.");
}

void task6_part1() {
  print("Welcome, students of New Uzbekistan University in Tashkent!");
}



void task2_part2() {
  String favoriteCity = "Tashkent";
  print("My favorite city is $favoriteCity.");
}

void task3_part2() {
  double bookPrice = 15.99;
  print("The price of the book is $bookPrice USD.");
}

void task4_part2() {
  bool isLearningDart = true;
  print("Am I learning Dart? The answer is $isLearningDart.");
}

void task5_part2() {
  String weather = "Sunny";
  int temperature = 32;
  print("Today's weather is $weather and the temperature is $temperature degrees Celsius.");
}

void task6_part2() {
  var numberOfApples = 10;
  print("Number of apples: $numberOfApples");

  numberOfApples = 12;
  print("Updated number of apples: $numberOfApples");
}


void task2_part3() {
  int studentScore = 75;
  if (studentScore >= 60) {
    print("Pass");
  } else {
    print("Fail");
  }
}

void task3_part3() {
  int hour = 14;
  if (hour < 12) {
    print("Good morning");
  } else if (hour <= 18) {
    print("Good afternoon");
  } else {
    print("Good evening");
  }
}

void task4_part3() {
  for (int i = 1; i <= 10; i++) {
    print(i);
  }
}

void task5_part3() {
  for (int i = 5; i >= 1; i--) {
    print(i);
  }
  print("Liftoff!");
}

void task6_part3() {
  for (int i = 1; i <= 20; i++) {
    if (i % 3 == 0) {
      print(i);
    }
  }
}


void greetByName(String name) {
  print("Hello, $name!");
}

int multiply(int a, int b) {
  return a * b;
}

bool isPositive(int number) {
  return number > 0;
}

double calculateAverage(double num1, double num2) {
  return (num1 + num2) / 2;
}

int multiplyArrow(int a, int b) => a * b;

void task2_part5() {

  String planet = 'Earth';
  print('We live on planet $planet.');
}

void task3_part5() {
  /*
  Author: Gulirano Tojimurodova
  Date: September 10, 2025
  This is my first Dart function.
  */
  void sayHello() {
    print('Hello from a function!');
  }

  sayHello();
}

void task4_part5() {
  // print('This message should not appear.');
  print('This message should appear.');
}



double calculateCircleArea(double radius) {
  return pi * radius * radius;
}

void task5_part5() {
  print(calculateCircleArea(5.0));
}

void task6_part5() {
  int speedOfLight = 299792458;
  print(speedOfLight);
}


void main() {
 
  //task2_part1();
  // task3_part1();
  // task4_part1();
  // task5_part1();
  // task6_part1();

  // task2_part2();
  // task3_part2();
  // task4_part2();
  // task5_part2();
  // task6_part2();
  
  // task2_part3();
  // task3_part3();
  // task4_part3();
  // task5_part3();
  // task6_part3();

  // greetByName("Gulirano");
  // print(multiply(7, 6));
  // print(isPositive(5));
  // print(isPositive(-3));
  // print(calculateAverage(10.5, 20.5));
  // print(multiplyArrow(7, 6));

  // task2_part5();
  // task3_part5();
  // task4_part5();
  // task5_part5();
  // task6_part5();
}

 