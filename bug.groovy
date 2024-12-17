```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null //this will return null, but the caller may expect an exception
  }
  //some logic here
}
```