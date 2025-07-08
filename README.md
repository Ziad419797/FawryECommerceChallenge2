# 📚 Quantum Bookstore

Quantum Bookstore is an extensible Java console application simulating an online bookstore with support for various book types such as paper books, eBooks, and demo books.  
Built as a challenge for **Fawry**.

---

## 🚀 Features

- ✅ Add books (PaperBook, EBook, ShowcaseBook) to the inventory
- ✅ Remove outdated books (based on max age)
- ✅ Purchase a book via:
  - 📦 Shipping if it's a PaperBook
  - 📧 Email if it's an EBook
- ❌ ShowcaseBooks are not purchasable

---

## 🧩 Book Types

| Book Type      | Shippable | Emailable | Purchasable | Notes                    |
|----------------|-----------|-----------|-------------|--------------------------|
| PaperBook      | ✅        | ❌        | ✅          | Has stock & can be shipped |
| EBook          | ❌        | ✅        | ✅          | Sent via email            |
| ShowcaseBook   | ❌        | ❌        | ❌          | For display only          |

---

## 📦 Class Structure

| Class Name               | Description                            |
|--------------------------|----------------------------------------|
| `Book`                   | Abstract class for all book types      |
| `PaperBook`              | Book with stock and shipping capability |
| `EBook`                  | Book with filetype, sent via email     |
| `ShowcaseBook`           | Not for sale, just for display         |
| `Inventory`              | Manages books (add, remove, buy)       |
| `Shippable`              | Interface for shipping functionality   |
| `Emailable`              | Interface for email functionality      |
| `QuantumBookstoreFullTest` | Demo class that tests the full flow   |


