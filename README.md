# 実行

```terminal
./gradlew bootRun
```

# WSDL ファイルの確認

```
http://localhost:8080/ws/calculator.wsdl
```

# 疎通確認

```
curl -H "Content-Type: text/xml" -d @add_request.xml http://localhost:8080/ws
```

# びみょいところ

.xsd から Java のコードを./gradlew genJaxb でビルドした後、ソースを/src に持ってくる必要がある。
