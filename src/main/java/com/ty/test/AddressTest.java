package com.ty.test;



import java.sql.Connection;

import java.sql.SQLException;

public class AddressTest {
    public static void main(String[] args){
        Connection con = null;
        try {
            con = ConfigUtil.getMySqlConnection();
            String sql = "update hcwx_weixin_address set isdefault = 1 where id = ?" ;
/*            UpdateSql updateSql =new UpdateSql(sql);
            updateSql.addParam("8354");
            updateSql.execute(con);*/
            /*PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,"8354");
            int i = preparedStatement.executeUpdate();
            if (i<1){
                throw  new Exception("�޸�ʧ��");
            }*/
            //  con.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                con.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        }
    }

