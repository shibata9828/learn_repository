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

### ランダムなサイコロの目を取得する

```java
/*
`Math.random()`は ０<= x <１ のランダムな数値を取得する
それを６倍することで ０<= x< 5 のランダムな数値を取得する
`(int)`でキャストすることで整数にする
1をプラスすることで 1 <= x <= 6 の整数が取得できる
*/

1 + (int)( Math.random() * 6.0 )

```

### while文のスコープに気を付ける

`while文`の中で変数を定義しない

```java
//do-while文の中で変数numを定義しているのでwhileの条件の中のnumまでスコープが届かずエラーになる
public static void main(String[] args) {

  do {
    int num = 1 + (int) (Math.random() * 6.0);
    System.out.println(num);

  } while (num < 6);
  System.out.println("「６が出たので処理を終了します」");
}

```