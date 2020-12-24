package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class LoginForm implements Serializable {
	//JAVAのインスタンスをバイト配列として出力することをSerializeという。
	//Serializeすることで、任意のクラスのデータをファイルに保存、ファイルから復元できるようになる（直列化可能）
	//spring bootでは、Formの場合、serializableを実装せよと言ったルールがあるため、使用している。
	
	private static final long serialVersionUID = 1L;
		//保存→再読み込みの間にデータは変更されていなくてもクラスに変更等があるなどの不測の事態に対応するため。
		//保存する際に、UIDを保存しておくことで、再読み込みされた際にUIDを取得し、違う場合は例外（エラー）を投げる
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	

}
