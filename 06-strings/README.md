

### 📂 Repository Structure
```
java-core-concepts/
└── 06-strings/
    ├── src/
    │   ├── StringOps.java       (Basic String methods)
    │   ├── StringBuilderDemo.java
    │   └── PalindromeCheck.java
    ├── README.md
    └── .gitignore
```

### 📝 README.md Content

```markdown
# Java String Operations

Core string manipulation concepts in Java with performance considerations.

## 🧩 Key Concepts
1. **String Immutability** - Security & thread-safety
2. **StringBuilder** - Mutable alternative for heavy manipulation
3. **Palindrome Checking** - Algorithm practice

## ⚡ Performance Comparison
| Operation       | String Time | StringBuilder Time |
|----------------|-------------|--------------------|
| 10k concats    | ~2000ms     | ~3ms               |

## 📚 Code Examples

### 1. Basic String Operations (`StringOps.java`)
```java
String str = "  Hello World  ";
System.out.println(str.trim().toUpperCase()); // "HELLO WORLD"
System.out.println("Apple".compareTo("Banana")); // -1
System.out.println("Coffee".substring(2, 5)); // "ffe"
```

### 2. StringBuilder Demo (`StringBuilderDemo.java`)
```java
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 10000; i++) {
    sb.append(i); // No new objects created
}
System.out.println(sb.length());
```

### 3. Palindrome Check (`PalindromeCheck.java`)
```java
boolean isPalindrome(String str) {
    return str.equals(new StringBuilder(str).reverse().toString());
}
```

## 🖥️ Sample Outputs

### String Operations
```
Original: "  Hello World  "
Trimmed: "Hello World"
Substring(3,7): "lo W"
```

### Palindrome Check
```
Input: "racecar"
Result: true

Input: "hello"
Result: false
```

## 🚀 How to Run
```bash
javac src/*.java
# Run specific demo:
java src/PalindromeCheck "level"
```

## 💡 Best Practices
- Use `String` for immutable text
- Use `StringBuilder` for loops/modifications
- Prefer `str.isEmpty()` over `str.length() == 0`
```

