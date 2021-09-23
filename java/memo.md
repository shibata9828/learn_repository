# ハマったところやハマったというほどではないところ

## Udemy 基礎編 Ex_08_1.java

### 配列へのString型のリテラルの代入

```java
//これはエラーになる(シングルクォーテーション)
String[] names = {'taro', 'takeshi'};

//これはエラーにならない（ダブルクォーテーション）
String[] names = {"taro", "takeshi"};
```
URL：https://shino-life-blog.com/java-error-invalid-font-num/
講義の中ではシングルクォーテーションでもエラーが起きていなかった

### VScodeでのJavaのコマンドライン引数の受け渡し

ファイルを実行したら`launch.json`が生成されるので、その中に書く

```json
    {
      "type": "java",
      "name": "Launch Ex1_08_3",
      "request": "launch",
      "mainClass": "Ex1_08_3",
      "projectName": "learn_repository_4828d982",
      "args": ["5", "8", "10"] 
    }
```

上では`args` でコマンドライン引数を渡している

### 改行メソッド

```java
//改行したくない時
print()

//改行したい時
println()
```