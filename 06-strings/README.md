

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

### Key Files to Include:

#### 1. StringOps.java
```java
public class StringOps {
    public static void main(String[] args) {
        String s = "  Java Rocks!  ";
        
        // Common methods
        System.out.println(s.trim()); // "Java Rocks!"
        System.out.println(s.substring(2, 6)); // "Java"
        System.out.println("Coffee".startsWith("Cof")); // true
        
        // Comparison
        System.out.println("apple".compareToIgnoreCase("APPLE")); // 0
    }
}
```

#### 2. StringBuilderDemo.java
```java
public class StringBuilderDemo {
    public static void main(String[] args) {
        // Mutable sequence
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World")
          .insert(5, " Awesome")
          .reverse();
        
        System.out.println(sb); // "dlroW emosewA olleH"
    }
}
```

#### 3. PalindromeCheck.java
```java
public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPal = cleaned.equals(
            new StringBuilder(cleaned).reverse().toString()
        );
        System.out.println(isPal); // true
    }
}
```

### Pro GitHub Tips:
1. **Add Visuals**:
   - Include screenshot of sample outputs in `/images` folder
   - Add UML diagram of String vs StringBuilder

2. **Enhanced README**:
   ```markdown
   ## 🏗️ Project Structure
   ```
   ```mermaid
   graph TD
       A[String] -->|Immutable| B[Thread-safe]
       C[StringBuilder] -->|Mutable| D[Faster concatenation]
   ```

3. **Version Tags**:
   ```bash
   git tag -a v1.0-strings -m "String operations release"
   git push origin v1.0-strings
   ```

