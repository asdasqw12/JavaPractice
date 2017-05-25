package org.dimigo.interfaces;

public class DBTest {
    public static void main(String[] args) {
        System.out.println(" << ���� �� >>");
        crud(IDBManager.getDBObject("SYBASE"));
        System.out.println("\n<< ���� �� >>");
        crud(IDBManager.getDBObject("ORACLE"));
    }
    private static void crud(IDBManager db){
        db.insert();
        db.search();
        db.update();
        db.delete();
    }
}