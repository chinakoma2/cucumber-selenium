# 🚀 **Cucumber-Selenium Testing Framework**

This project is a **Cucumber-Selenium** testing framework that allows you to run automated tests using **Google Chrome**.

🔹 You can choose between:

- Using **Chrome Portable** (if you don’t want to install Chrome system-wide).
- Using your **system-installed** Chrome version.

Follow the setup instructions based on your preference.

---

## 🛠️ **Prerequisites**

Before running the tests, ensure you have the correct setup based on your preferred Chrome installation method.

---

## 🌐 **Option 1: Using Chrome For Testing Portable**

### 1️⃣ **Download Chrome For Testing Portable**

- Download **Google Chrome For Testing Portable** from:  👉 [Chrome Portable Download](https://googlechromelabs.github.io/chrome-for-testing/#stable)
- Extract the files.

### 2️⃣ **Download ChromeDriver**

- **Ensure ChromeDriver version matches your Chrome version** from:  👉 [ChromeDriver Download](https://googlechromelabs.github.io/chrome-for-testing/#stable)
- Extract `chromedriver.exe`.

### 3️⃣ **Place the Files in the Correct Paths**

📂 **ChromeDriver:**

```bash
src/main/resources/selenium/drivers/chromedriver.exe
```

📂 **Chrome Browser:**

```bash
src/main/resources/selenium/browsers/chrome/chrome.exe
```

### 4️⃣ **Modify the `setUp()` Method**

If using **Chrome Portable**, update the `setUp()` method in your Selenium configuration to set the correct binary path:

```java
public void setUp() {
    System.setProperty("webdriver.chrome.driver", SeleniumPathUtil.getChromeDriverPath());
    ChromeOptions options = new ChromeOptions();
    options.setBinary(SeleniumPathUtil.getChromeBinaryPath()); // Ensure this points to the portable Chrome
    this.driver = new ChromeDriver(options);
    this.driver.manage().window().maximize();
}
```

---

## 💻 **Option 2: Using System-Installed Chrome**

### 1️⃣ **Ensure Chrome is Installed**

- Install **Google Chrome** if you don’t have it already:  👉 [Google Chrome Download](https://www.google.com/chrome/)
- Verify Chrome is installed by running:

```sh
chrome --version
```

### 2️⃣ **Download ChromeDriver**

- Find the **correct ChromeDriver version** based on your installed Chrome version:  👉 [ChromeDriver Download](https://googlechromelabs.github.io/chrome-for-testing/)
- Extract `chromedriver.exe`.

### 3️⃣ **Place ChromeDriver in the Correct Path**

📂 **ChromeDriver:**

```bash
src/main/resources/selenium/drivers/chromedriver.exe
```

### 4️⃣ **Modify the `setUp()` Method**

If using **system-installed Chrome**, update the `setUp()` method to remove the explicit binary path:

```java
public void setUp() {
    System.setProperty("webdriver.chrome.driver", SeleniumPathUtil.getChromeDriverPath());
    ChromeOptions options = new ChromeOptions();
    // No need to set binary path, Chrome will be used from system installation
    this.driver = new ChromeDriver(options);
    this.driver.manage().window().maximize();
}
```
---

## ❗ **Troubleshooting**

- **Ensure Chrome and ChromeDriver versions match.**
- **Check if `chromedriver.exe` has execution permissions.**
- **For Portable Chrome, confirm the binary path is correctly set in `setUp()`.**

---
