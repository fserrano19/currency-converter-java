# Currency Converter - Java

## Description

This project is a **Currency Converter application developed in Java** that interacts with a real exchange rate API to convert between different currencies.

The application retrieves real-time exchange rates, processes the JSON response using **Gson**, and allows users to perform currency conversions through an interactive console menu.

This project was developed as part of the **Oracle Next Education (ONE) program challenge**, focusing on learning how to work with APIs, JSON data, and Java's modern HTTP client.

---

## Features

* Fetch real-time exchange rates from an external API
* Parse JSON responses using the Gson library
* Convert between multiple currencies
* Interactive console menu for user input
* Clean and modular Java architecture
* Error handling for API responses

Supported conversions:

1. Dollar → Argentine Peso
2. Argentine Peso → Dollar
3. Dollar → Brazilian Real
4. Brazilian Real → Dollar
5. Dollar → Colombian Peso
6. Colombian Peso → Dollar

---

## Technologies Used

* **HttpClient API**
* **Gson (Google JSON library)**
* **ExchangeRate API**
* **Console-based user interface**

---

## Project Structure

```
src
│
├── Main.java
├── ConsoleMenu.java
├── ExchangeApiClient.java
├── ExchangeRequestBuilder.java
├── ExchangeResponseHandler.java
├── ExchangeRateParser.java
├── CurrencyFilter.java
└── CurrencyConverter.java
```

Each class has a specific responsibility:

* **ExchangeApiClient** → Creates and manages the HTTP client
* **ExchangeRequestBuilder** → Builds the API request
* **ExchangeResponseHandler** → Sends the request and handles the response
* **ExchangeRateParser** → Parses JSON data from the API
* **CurrencyFilter** → Extracts selected currencies
* **CurrencyConverter** → Handles conversion calculations
* **ConsoleMenu** → Manages user interaction
* **Main** → Application entry point

---

## API Used

This project uses the **ExchangeRate API** to obtain real-time currency exchange rates.

Documentation:
https://www.exchangerate-api.com/docs

Example endpoint used:

```
https://v6.exchangerate-api.com/v6/YOUR_API_KEY/latest/USD
```

---

## 💻 Example Usage

```
=== Currency Converter ===

1) Dollar => Argentine Peso
2) Argentine Peso => Dollar
3) Dollar => Brazilian Real
4) Brazilian Real => Dollar
5) Dollar => Colombian Peso
6) Colombian Peso => Dollar
7) Exit
```

Example conversion:

```
Enter amount: 100
100 USD = 526.75 BRL
```

---

## Author

Developed by **Luis Fernando Serrano Madrigal**
