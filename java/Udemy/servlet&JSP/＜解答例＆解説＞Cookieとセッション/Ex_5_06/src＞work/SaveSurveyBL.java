package work;

/**----------------------------------------------------------------------*
 *■■■SaveSurveyBLクラス■■■
 *概要：ビジネスロジック（アンケートデータの登録）
 *----------------------------------------------------------------------**/
public class SaveSurveyBL {

	/**----------------------------------------------------------------------*
	 *■executeInsertSurveyメソッド
	 *概要　：対象のアンケートデータを登録する
	 *引数　：対象のアンケートデータ（SurveyDto型）
	 *戻り値：DB操作成功フラグ（true:成功/false:失敗）
	 *----------------------------------------------------------------------**/
	public boolean executeInsertSurvey(SurveyDto dto) {

		boolean succesInsert = false ;  //DB操作成功フラグ（true:成功/false:失敗）

		//-------------------------------------------
		//データベースへの接続を実施
		//-------------------------------------------

		//DAOクラスをインスタンス化＆対象のユーザーデータを登録するよう依頼
		SurveyDao dao = new SurveyDao();
		succesInsert = dao.doInsert(dto);

		return succesInsert;
	}

}
