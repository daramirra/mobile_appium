### Run tests in Browserstack
```bash
gradle clean test -DdeviceHost=browserstack
```
### Run tests in Selenoid
```bash
gradle clean test -DdeviceHost=selenoid
```
### Run tests in Emulator (set device name in properties)
```bash
gradle clean test -DdeviceHost=emulation
```
### Run tests on real device (set device name in properties)
```bash
gradle clean test -DdeviceHost=real
