package servlet;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Bean implements Serializable {
    private String id;
    private String pass;
    private boolean result;

    /**
     * デフォルトコンストラクタ
     */
    public Bean() {

    }

    /**
     * コンストラクタ
     * @param id
     * @param pass
     */
    public Bean(String id, String pass) {
        this.id = id;
        this.pass = pass;
    }
    /**
     * ログイン処理
     * @return
     */
    public boolean login() {
        List<Bean> list ;
        boolean isOk = false;
        try {
            // DBからユーザー情報を読み出す
            list = this.referenceDB();
            if(list.size() == 0) {
                // ユーザー情報数が0の場合
                isOk = false;
            } else if (list.size() > 0) {
                // ユーザー情報が1件でも存在する場合
                isOk = true;
            }
        } catch (ClassNotFoundException e) {
           return false;
        }
        return isOk;
    }

    /**
     * databaseへのアクセスメソッド
     * @return
     * @throws ClassNotFoundException
     */
    public List<Bean> referenceDB() throws ClassNotFoundException {
        List<Bean> list = new ArrayList<>();
        String tableName = "USERINFO";
        String sql = "select * from " + tableName + " where uid = '" + this.id + "' and pass = '" + this.pass + "'";
        System.out.println("SQL [" + sql + "]");

     // ドライバーの読み込み
        Class.forName("com.mysql.cj.jdbc.Driver"); // 検索に失敗する場合は必要
        // Connectionオブジェクトの取得. DBへ接続
        try (Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/sampledb?serverTimezone=JST",
            "root", "root");

            // Statementオブジェクトを取得, SQL実行の準備
            Statement stmt = conn.createStatement();

            // SQLを実行し, DBよりデータを参照する.
            ResultSet rs = stmt.executeQuery(sql)  ) {

          // 1行ずつ読み込む
          while (rs.next()) {
              Bean item =
                      new Bean(rs.getString("uid"), rs.getString("pass"));
              list.add(item);
          }
      } catch (Exception e) {
        e.printStackTrace();
      }
        return list;
    }


    /**
     * IDの取得
     * @return
     */
    public String getId() {
        return id;
    }
    /**
     * IDの設定
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * パスワードの取得
     * @return パスワード
     */
    public String getPass() {
        return pass;
    }
    /**
     * パスワードの設定
     * @param pass
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
    /**
     * 認証結果を返す
     * @return
     */
    public boolean isResult() {
        return result;
    }

    /**
     * 認証結果を格納する
     * @param result
     */
    public void setResult(boolean result) {
        this.result = result;
    }
}
