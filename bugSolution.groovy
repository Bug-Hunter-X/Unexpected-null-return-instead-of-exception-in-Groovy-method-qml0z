```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    throw new IllegalArgumentException("Arguments cannot be null")
  }
  //some logic here
}
```