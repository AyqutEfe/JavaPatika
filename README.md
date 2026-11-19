# JavaPatika

Beginner Java exercises: 40 small console programs covering the fundamentals, from conditionals and loops to methods and recursion.

## Overview

Each file in [`src/`](src) is a standalone class with its own `main` method that reads input from the console with `Scanner` and prints a result. There are no external dependencies and no build tool; the project is an IntelliJ IDEA module (project SDK set to JDK 21 in `.idea/misc.xml`). Some programs use text blocks, so JDK 15 or newer is required.

Program prompts and messages are in Turkish; class names are Turkish as well.

## Topics covered

- Input and output with `Scanner`, primitive types and arithmetic
- Conditionals: `if / else if`, `switch`, ternary operator
- Loops: `for`, `while`, `do-while`, nested loops
- Methods (`static`), parameters and return values
- Recursion
- Text blocks and simple menu-driven programs

## Exercise index

| Program | Topic | Concepts |
| --- | --- | --- |
| [ArtikYil](src/ArtikYil.java) | Leap year check | `if / else if`, modulo |
| [AsalSayi](src/AsalSayi.java) | Primes up to 100 | nested loops, `Math.sqrt` |
| [AsalSayiKontrol](src/AsalSayiKontrol.java) | Prime check for a given number | loop, `break` |
| [Atm](src/Atm.java) | ATM simulation with a login attempt limit | `while`, `do-while`, `switch`, text block |
| [BasamakTop](src/BasamakTop.java) | Sum of digits | `while`, `%` and `/` |
| [BasitHesapMakinasi](src/BasitHesapMakinasi.java) | Four-operation calculator | `switch`, division by zero check |
| [BurcBulucu](src/BurcBulucu.java) | Zodiac sign from birth date | nested `if` |
| [CiftSayiToplayici](src/CiftSayiToplayici.java) | Sum entered numbers while they are multiples of 4 | `do-while`, `break` |
| [CinZodyagi](src/CinZodyagi.java) | Chinese zodiac animal from birth year | `switch`, modulo |
| [DaireninAlani](src/DaireninAlani.java) | Area of a circle slice for a given angle | arithmetic |
| [DersOrtalamasi](src/DersOrtalamasi.java) | Grade average and pass/fail | `float`, ternary operator |
| [DersOrtalamasiIki](src/DersOrtalamasiIki.java) | Grade average with 0-100 input validation | validation, early `return` |
| [EbobEkok](src/EbobEkok.java) | GCD and LCM | `while` loop |
| [EbsEks](src/EbsEks.java) | Minimum and maximum of N numbers | `for`, comparisons |
| [Elmas](src/Elmas.java) | Diamond pattern | nested loops |
| [FaktorBulucu](src/FaktorBulucu.java) | Factorial (iterative) | `for` |
| [FibonacciMetot](src/FibonacciMetot.java) | N-th Fibonacci number (recursive) | recursion, methods |
| [FibonacciSeri](src/FibonacciSeri.java) | N-th Fibonacci number (iterative) | `for` |
| [GelismisHesapMakinasi](src/GelismisHesapMakinasi.java) | Menu calculator: arithmetic, power, factorial, modulo, rectangle area and perimeter | methods, `switch`, text block |
| [Harmonik](src/Harmonik.java) | Harmonic series sum | `for`, `double` |
| [Hipotenus](src/Hipotenus.java) | Triangle area from three sides (Heron's formula) | `Math.sqrt` |
| [KdvHesaplama](src/KdvHesaplama.java) | VAT calculation with a price threshold | ternary operator |
| [Kombinasyon](src/Kombinasyon.java) | Combinations C(n, k) | factorial loops |
| [KullaniciGirisi](src/KullaniciGirisi.java) | Login with password reset prompt | `String.equals`, nested `if` |
| [ManavKasa](src/ManavKasa.java) | Grocery checkout total | `double`, input |
| [MukemmelSayi](src/MukemmelSayi.java) | Perfect number check | `for`, divisors |
| [Palindrom](src/Palindrom.java) | Palindrome number check | method returning `boolean` |
| [RecursiveAsal](src/RecursiveAsal.java) | Prime check (recursive) | recursion |
| [RecursiveMetot](src/RecursiveMetot.java) | Exponentiation (recursive) | recursion |
| [RecursiveUs](src/RecursiveUs.java) | Exponentiation (recursive, variant) | recursion |
| [SayiSiralayici](src/SayiSiralayici.java) | Order three numbers | nested `if` |
| [SicakligaGoreEtkinlik](src/SicakligaGoreEtkinlik.java) | Activity suggestion by temperature | `if / else if` ranges |
| [TaksiMetre](src/TaksiMetre.java) | Taxi fare with a minimum charge | ternary operator |
| [TersUcgen](src/TersUcgen.java) | Inverted triangle pattern | nested loops |
| [UcVeDortBolen](src/UcVeDortBolen.java) | Average of numbers divisible by both 3 and 4 | `for`, `%` |
| [UcakBileti](src/UcakBileti.java) | Plane ticket price with age and round-trip discounts | validation, discounts |
| [UsluBulucu](src/UsluBulucu.java) | Power calculation | `for` |
| [VucutEndeksi](src/VucutEndeksi.java) | Body mass index | `double` |
| [Yildiz](src/Yildiz.java) | Star triangle pattern | nested loops |

## Getting started

Requires JDK 15 or newer (the IDE project uses JDK 21).

```bash
git clone https://github.com/AyqutEfe/JavaPatika.git
cd JavaPatika

# compile and run any exercise, for example the diamond pattern
javac -d out src/Elmas.java
java -cp out Elmas
```

Or open the folder in IntelliJ IDEA and run any class with its `main` method.
