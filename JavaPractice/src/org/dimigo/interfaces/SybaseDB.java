package org.dimigo.interfaces;

public class SybaseDB implements IDBManager{
    public void insert(){
        System.out.println("Sybase DB ����");
    }

    @Override
    public void delete() {
        System.out.println("Sybase DB ����");

    }

    @Override
    public void search() {

        System.out.println("Sybase DB ��ȸ");
    }

    @Override
    public void update() {

        System.out.println("Sybase DB ����");
    }
} 