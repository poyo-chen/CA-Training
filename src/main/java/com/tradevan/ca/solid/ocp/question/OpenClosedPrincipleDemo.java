package com.tradevan.ca.solid.ocp.question;

public class OpenClosedPrincipleDemo {

	// question: 如何讓外部新增貸款種類及驗證程式, 不會引響到使用 LoanHandler 程式
	// 預期: 假定 LoanHandler 要包成 jar 檔, 不讓外部使用者修改, 且會定期更新
	public static void main(String[] args) {
		LoanHandler loanHandler = new LoanHandler();
		User user = new User();

		loanHandler.approvePersonalLoan(user);
		loanHandler.approveMortgage(user);

	}

}
