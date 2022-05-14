package com.tradevan.ca.solid.lsp.question;

public class LiskovSubstitutionPrincipleDemo {

    // question: 利用 LSP 方法, 修正鴕鳥(Ostrich) 在 runtime 的時候, 誤用 fly() 會拋出錯誤的問題
    public static void main(String[] args) {
        //可以避免放入錯誤類別，呼叫錯誤方法
//		Bird[] birds = new Bird[] { new Crow(), new Sparrow(), new Ostrich() };
//		for (Bird bird : birds) {
//			bird.fly();
//		}

        FlyBird[] birds = new FlyBird[]{new Crow(), new Sparrow()};
        for (FlyBird bird : birds) {
            bird.fly();
        }
    }

}
